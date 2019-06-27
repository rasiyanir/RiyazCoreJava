package com.Wells.transaction;

import com.Wells.exception.InsufficientFundException;
import com.Wells.fund.BankFund;



public class LoanTransaction extends Thread{
	private BankFund bankFund;
	private int customerId;
	private double loanAmount;
	
	public LoanTransaction(BankFund bankFund, int customerId, double loanAmount) {
		super();
		this.bankFund = bankFund;
		this.customerId = customerId;
		this.loanAmount = loanAmount;
	}
	
	public void run()  {
		
		synchronized (bankFund) {
			try {
				bankFund.checkFund(loanAmount);
				
				try {
					Thread.sleep((long) (2000*Math.random()));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				double fundAvailable = bankFund.debitFund(loanAmount);
				
				System.out.println(customerId + " The loan is disbursed. Please collect the cash from Teller");
				System.out.println("Fund left in the bank " + fundAvailable);
			} 
			catch(InsufficientFundException insufficientFundException) {
				System.out.println("Sorry!!! " + customerId + " Please try some days later as we are short of funds");
			}
		}
		
		/*try {
			bankFund.checkFund(loanAmount);
		
			try {
				Thread.sleep((long) (2000*Math.random()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			double fundAvailable = bankFund.debitFund(loanAmount);
			
			
			System.out.println(customerId + " The loan is disbursed. Please collect the cash from Teller");
			System.out.println("Fund left in the bank " + fundAvailable);
		}*/
		
	}
}
