package com.Wells.transaction;

import com.Wells.account.Account1;

public class DepositTransaction1 extends Thread {
	
	private int transactionId;
	private Account1 account;
	private double amount;
	private int customerId;
	
	public DepositTransaction1(int transactionId, Account1 account, int customerId, double amount) {
		//super();
		this.transactionId = transactionId;
		this.account = account;
		this.amount = amount;
		this.customerId = customerId;
	}
	
	public synchronized void deposit(Account1 account, double amount) {
		account.setBalance((account.getBalance() + amount));
	}
	
	
	public void run() {
		deposit(account, amount);
		
		System.out.println(transactionId + " transaction completed!!!" + customerId + " thank you for depositing to the Account" + account.getAccountNo());
	}
	
}
