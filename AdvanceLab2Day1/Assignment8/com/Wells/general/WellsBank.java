package com.Wells.general;

import com.Wells.fund.BankFund;
import com.Wells.transaction.LoanTransaction;

public class WellsBank {
		
	public static void main(String[] args) throws InterruptedException {
		BankFund WellsBankFund = new BankFund(9000000);
		
		LoanTransaction[] loanTransaction = new LoanTransaction[100];
		
		for(int index = 0; index < loanTransaction.length; index++) {
			loanTransaction[index] = new LoanTransaction(WellsBankFund, (1000 + index), 250000);
		}
		
		for(int index = 0; index < loanTransaction.length; index++) {
			loanTransaction[index].start();
			//loanTransaction[index].join();
		}
	}
}
