package com.Wells.security;

import com.Wells.account.Account;
import com.Wells.customer.Customer;
import com.Wells.exception.UnAuthorizedWithdrawTransactionException;

public class Security {
		
	public void authorization(Account account, Customer customer) throws UnAuthorizedWithdrawTransactionException{
		
		if(account.getCustomer().getCustomerId() != customer.getCustomerId()){
			throw new UnAuthorizedWithdrawTransactionException();
		}
	}
}
