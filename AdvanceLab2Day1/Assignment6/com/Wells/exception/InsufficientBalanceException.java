package com.Wells.exception;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException() {
		super("Insufficient Balance in the account");
	}
}	
