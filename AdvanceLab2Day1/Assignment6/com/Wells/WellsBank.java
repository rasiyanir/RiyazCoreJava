package com.Wells;

import com.Wells.account.Account;
import com.Wells.customer.Customer;
import com.Wells.transaction.DepositTransaction;
import com.Wells.transaction.WithdrawTransaction;
import com.Wells.transaction.WithdrawTransaction1;

public class WellsBank {
	
	public static void main(String[] args) {
		
		Customer firstCustomer = new Customer(1001, "Raj");
		
		Account firstAccount = new Account(2001, firstCustomer, 20000);
		
		Customer secondCustomer = new Customer(1002, "Narayan");
		
		Account secondAccount = new Account(2002, secondCustomer, 20000);
		
		DepositTransaction firstDeposit = new DepositTransaction(9001, secondAccount, 5001, 4000);
		
		firstDeposit.start();
		
		DepositTransaction secondDeposit = new DepositTransaction(9002, firstAccount, 5002, 7000);
		
		secondDeposit.start();
		
		WithdrawTransaction secondWithdearTransaction = new WithdrawTransaction(9004, firstAccount, firstCustomer, 500);
		Thread secondWithdraw = new Thread(secondWithdearTransaction);
		secondWithdraw.start();
		
		WithdrawTransaction firstWithdearTransaction = new WithdrawTransaction(9003, firstAccount, firstCustomer, 500);
		Thread firstWithdraw = new Thread(firstWithdearTransaction);
		firstWithdraw.start();
	}
}
