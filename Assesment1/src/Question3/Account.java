package Question3;

public class Account {
	private int accountNumber;
	private double balance;
	public static int totalAccounts;
	
	public Account() {
		++totalAccounts;
	}
	
	public Account(int accountNumber, double balance) {
		this();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(int amount) throws NegativeAmountException{
		if(amount > 0) {
			balance += amount;
			System.out.println("AccountNO: " + accountNumber + " Available balance: " + balance);
		}
		else {
			throw new NegativeAmountException();
		}
		
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(balance > amount) {
			balance -= amount;
			System.out.println("AccountNO: " + accountNumber + " Available balance: " + balance);
		}
		else {
			throw new InsufficientBalanceException();
		}
	}
}


