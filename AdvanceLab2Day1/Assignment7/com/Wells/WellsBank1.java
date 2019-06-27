package com.Wells;

import com.Wells.account.Account1;
import com.Wells.customer.Customer;
import com.Wells.transaction.DepositTransaction1;
import com.Wells.transaction.WithdrawTransaction1;

public class WellsBank1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Customer firstCustomer = new Customer(1001, "Raj");
		
		Account1 firstAccount = new Account1(2001, firstCustomer, 20000);
		
		Customer secondCustomer = new Customer(1002, "Narayan");
		
		Account1 secondAccount = new Account1(2002, secondCustomer, 20000);
		
		DepositTransaction1 firstDeposit = new DepositTransaction1(9001, secondAccount, 5001, 4000);
		
		firstDeposit.start();
		
		DepositTransaction1 secondDeposit = new DepositTransaction1(9002, firstAccount, 5002, 7000);
		
		secondDeposit.start();
		
		
		
		WithdrawTransaction1 secondWithdrawTransaction = new WithdrawTransaction1(9004, firstAccount, firstCustomer, 1000);
		Thread secondWithdraw = new Thread(secondWithdrawTransaction);
		secondWithdraw.start();
		
		//secondWithdraw.join();
		
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		WithdrawTransaction1 firstWithdrawTransaction = new WithdrawTransaction1(9003, firstAccount, firstCustomer, 2000);
		Thread firstWithdraw = new Thread(firstWithdrawTransaction);
		firstWithdraw.start();
		
		//firstWithdraw.join();
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		WithdrawTransaction1 thirdWithdrawTransaction = new WithdrawTransaction1(9005, firstAccount, firstCustomer, 3000);
		Thread thirdWithdraw = new Thread(thirdWithdrawTransaction);
		thirdWithdraw.start();
		
		
		//thirdWithdraw.join();
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		WithdrawTransaction1 fourthWithdrawTransaction = new WithdrawTransaction1(9006, firstAccount, firstCustomer, 4000);
		Thread fourthWithdraw = new Thread(fourthWithdrawTransaction);
		fourthWithdraw.start();
		
		//fourthWithdraw.join();
		
	}
}
