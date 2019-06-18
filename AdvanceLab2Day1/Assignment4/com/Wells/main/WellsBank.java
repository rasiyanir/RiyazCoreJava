package com.Wells.main;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.Wells.DB.CustomerDB;
import com.Wells.customer.Customer;
import com.Wells.login.Login;

public class WellsBank {

	private static CustomerDB customerDB = new CustomerDB();
	
	private static Login login = new Login();
	
	public static void main(String[] args) {
		Customer cust1 = new Customer(1001, "Ten", false);
		customerDB.saveCustomer(cust1);
		
		Customer custx = new Customer(1009, "abc");
		
		customerDB.saveCustomer(custx);
		
		login.addLogin(1001, "Wells123");
		
		Customer cust2 = new Customer(1002, "John", true);
		customerDB.saveCustomer(cust2);
		
		login.addLogin(1002, "Wells123");
		
		Customer cust3 = new Customer(1003, "Sam", true);
		customerDB.saveCustomer(cust3);
		
		login.addLogin(1003, "Mys@123");
		
		Customer cust4 = new Customer(1004, "Raj", false);
		customerDB.saveCustomer(cust4);
		
		login.addLogin(1004, "Wells123");
		
		List<Customer> customerList = customerDB.getAllCustomers();
		
		if(customerList.isEmpty()) {
			System.out.println("No Customers in the Bank");
		}
		else {
			printCustomerList(customerList);
		}
		
		
		Set<Integer> loanAvailedCustomers = customerDB.getLoanAvailedCustomers();
		System.out.println("\n Customers who have Availed the loan");
		System.out.println("--------------------------------------");
		for(int custId:loanAvailedCustomers) {
			System.out.println(custId);
		}
	}
	
	public static void printCustomerList(List<Customer> customerList) {
		//Iterator<Customer> custIterator = customerList.iterator();
		
		System.out.println("               Customer Details");
		System.out.println("---------------------------------------------");
		System.out.println("cust Id\tcustomer Name\tLoan Availed" );
		
		/*
		 * while(custIterator.hasNext()) { Customer customer = custIterator.next();
		 * System.out.print(customer.getCustomerId() + "\t");
		 * System.out.print(customer.getCustomerName() + "\t\t");
		 * 
		 * String displayString = "NO"; if(customer.isLoanAvailed()) { displayString =
		 * "YES"; } System.out.println(displayString); System.out.println(); }
		 */
		
		for(Customer cust: customerList) {
			System.out.print(cust.getCustomerId() + "\t");
			System.out.print(cust.getCustomerName() + "\t\t");
			String displayString = "NO";
			if(cust.isLoanAvailed()) {
				displayString = "YES";
			}
			System.out.println(displayString);
			System.out.println();
		}
	}
	
}
