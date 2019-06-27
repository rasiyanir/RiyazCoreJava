package com.Wells.exception;

public class UnAuthorizedWithdrawTransactionException1 extends Exception {
	
	public UnAuthorizedWithdrawTransactionException1() {
		super("The user is unauthorized for the withdrawal");
	}
}
