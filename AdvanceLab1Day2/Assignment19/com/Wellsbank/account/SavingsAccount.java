package com.Wellsbank.account;

import com.Wellsbank.customer.Customer;

public class SavingsAccount extends Account {
	private double minimumBalance = 500;
	private int interestRate = 12;
	
	public SavingsAccount() {
		System.out.println("Savings Account default");
	}
	
	public SavingsAccount(int accountNo, Customer customer, double balance) {
		super(accountNo, customer, balance);
	}
	
	public void withdraw(double amount) {
		if((balance -= amount) >= minimumBalance) {
			balance -= amount;
		}
		else {
			System.out.println("Your balance cannot be less than 500.");
		}
		
	}
	
	public void calculateInterest() {
		balance += (balance*12/100);
	}
}
