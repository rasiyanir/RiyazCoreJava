package Assignment14;

public class Account {
	private int accountNo;
	private Customer customer;
	protected double balance;
	
	public Account() {
		System.out.println("Account default");
	}
	
	public Account(int accountNo, Customer customer, double balance) {
		System.out.println();
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Customer getCustomer() {
		return new Customer();
	}
	
	public double balanceEnquiry() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
