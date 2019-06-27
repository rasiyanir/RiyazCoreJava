package com.Wells.transaction;

import com.Wells.account.Account1;
import com.Wells.customer.Customer;
import com.Wells.exception.InsufficientBalanceException1;
import com.Wells.exception.UnAuthorizedWithdrawTransactionException1;
import com.Wells.security.Security1;

public class WithdrawTransaction1 extends Security1 implements Runnable {
	private int transactionId;
	private Account1 account;
	private Customer customer;
	private double amount;
	
	public WithdrawTransaction1(int transactionId, Account1 account, Customer customer, double amount) {
		//super();
		this.transactionId = transactionId;
		this.account = account;
		this.customer = customer;
		this.amount = amount;
	}
	
	public double withdraw(Account1 account, double amount) throws InsufficientBalanceException1 {
			if(account.getBalance() >= amount) {
				account.setBalance(account.getBalance() - amount);
			}else {
				throw new InsufficientBalanceException1();
			}
		
		
		return account.getBalance();
	}
	
	public void run() {
		synchronized (account) {
			try {
				authorization(account, customer);
				
				double balance = withdraw(account, amount);
				
				/*
				 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */
				
				System.out.println(transactionId + " transaction completed!!! and the balance amount is " + balance);		
			}
			catch(UnAuthorizedWithdrawTransactionException1 unAuthorizedWithdrawTransactionException) {
				System.out.println(transactionId + " transaction failed!!! and " + unAuthorizedWithdrawTransactionException.getMessage());
			}
			catch(InsufficientBalanceException1 insufficientBalanceException) {
				System.out.println(transactionId + " transaction failed!!! and your account has insufficient " + account.getBalance());
			}
		}
		
	}
}
