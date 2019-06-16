package Assignment17;

public class CurrentAccount extends Account {
	private double currentAmount;
	
	public CurrentAccount() {
		
	}
	
	
	
	public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount) {
		super(accountNo, customer, balance);
		this.currentAmount = currentAmount;
		// TODO Auto-generated constructor stub
	}



	public void withdraw(double amount) {
		if((balance - amount) > 0) {
			balance -= amount;
		}
		else if((balance - amount) > getEligibilityAmount()) {
			balance -= amount;
			currentAmount += balance;
			balance = 0;
		}
		else {
			System.out.println("Cannot withdraw more than " + (balance + currentAmount));
		}
		
	}
	
	public double getEligibilityAmount() {
		return -currentAmount;
	}
}
