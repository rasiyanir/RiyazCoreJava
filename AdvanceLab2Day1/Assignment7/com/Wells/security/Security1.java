package com.Wells.security;

import com.Wells.account.Account1;
import com.Wells.customer.Customer;
import com.Wells.exception.UnAuthorizedWithdrawTransactionException1;

public class Security1 {
		
	public void authorization(Account1 account, Customer customer) throws UnAuthorizedWithdrawTransactionException1{
		
		if(account.getCustomer().getCustomerId() != customer.getCustomerId()){
			throw new UnAuthorizedWithdrawTransactionException1();
		}
	}
}
