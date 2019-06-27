package com.imcs.tester;

import com.imcs.account.Account;
import com.imcs.customer.Customer;
import com.imcs.dB.AccountFileDB;
import com.imcs.dB.CustomerFileDB;
import com.imcs.general.ReadData;

public class CustomerTester {
	
	public void acceptCutomerInfo(){
		System.out.println("\n\n\tPlease enter the details of the customer");
		System.out.print("Customer Id :"); 
		String custId=ReadData.acceptString(); 
		System.out.print("Customer Name :");
		String custName=ReadData.acceptString();
		Customer customer=new Customer();
		customer.setCustomerId(Integer.parseInt(custId));
		customer.setCustomerName(custName);
		int status=new CustomerFileDB().saveCustomer(customer);
		if(status==0){
		
		System.out.println("Your details are saved"); 
		ReadData.acceptString();
		System.out.println("\n\n\n\n\n\n\n");
		}
		else{
		
		System.out.println("Your details could not be saved.Please try later");
		ReadData.acceptString();
		System.out.println("\n\n\n\n\n\n\n");
		}
		}
	

	
	public void displayCustInfo(){
		
		System.out.print("\n\nPlease enter customer Id :");
		String custId=ReadData.acceptString();
		Customer customer=new CustomerFileDB().getCustomer(Integer.parseInt(custId));

		if(customer!=null){
		
		System.out.println("\n Customer Id "+customer.getCustomerId());

		System.out.println(" Customer Name "+customer.getCustomerName());

		}
		else
		{
			System.out.println("Invalid customerId!!!"); 
			ReadData.acceptString();
			System.out.println("\n\n\n\n\n\n\n");
		}
		}
	
	public void acceptAccountInfo(){
		System.out.println("\n\n\tPlease enter the details of the account");
		System.out.print("Account No :"); 
		String accountNo=ReadData.acceptString(); 
		System.out.print("Balance :");
		String balance=ReadData.acceptString();
		Account account=new Account();
		account.setAccountNo(Integer.parseInt(accountNo));
		account.setBalance(Integer.parseInt(balance));
		int status=new AccountFileDB().saveAccount(account);
		if(status==0){
		System.out.println("Your details are saved"); 
		ReadData.acceptString();
		System.out.println("\n\n\n\n\n\n\n");
		}
		else{
		
		System.out.println("Your details could not be saved.Please try later");
		ReadData.acceptString();
		System.out.println("\n\n\n\n\n\n\n");
		}
		}
	
	public void displayAccountInfo(){
		
		System.out.print("\n\nPlease enter account no :");
		String accountNo=ReadData.acceptString();
		Account account=new AccountFileDB().getAccount(Integer.parseInt(accountNo));

		if(account!=null){
		
		System.out.println("\n Account No "+account.getAccountNo());

		System.out.println(" Balance "+account.getBalance());

		}
		else
		{
			System.out.println("Invalid accountNo!!!"); 
			ReadData.acceptString();
			System.out.println("\n\n\n\n\n\n\n");
		}
		}
	
	public void customerMenu(){
		while(true){
		System.out.println("\tCustomer Menu");
		System.out.println("----------------------------------------");
		System.out.println("1. Add Customer");
		System.out.println("2. Get customer Info");
		System.out.println("3. Add Account");
		System.out.println("4. Get Account Info");
		System.out.println("5. Exit");
		System.out.print("\nEnter option :"); 
		String optedValue=ReadData.acceptString(); 
		int option=Integer.parseInt(optedValue); 
		switch(option){
		case 1: acceptCutomerInfo(); break;
		case 2: displayCustInfo();break;
		case 3: acceptAccountInfo(); break;
		case 4: displayAccountInfo(); break;
		case 5: System.exit(0);break;
		default :System.out.println("Enter a valid option");

		ReadData.acceptString();


		}
		}
		}
}
