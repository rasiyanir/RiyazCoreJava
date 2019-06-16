package Assignment26;

public class WellsBank {
	public static void main(String[] args) {
		Customer john = new Customer(9001, "John", "124 silicon Dr, Irving", 32468);
		//Account account = new Account();
		SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
		Customer jenny = new Customer(2042, "Jenny", "524 western Lane, Houston", 45321);
		CurrentAccount jennyCA = new CurrentAccount(102, jenny, 2000, 5000);
		try {
			johnSA.withdraw(300);
			System.out.println(johnSA.balanceEnquiry());
			System.out.println();
			jennyCA.deposit(500);
			System.out.println(jennyCA.getEligibilityAmount());
			System.out.println(jennyCA.balanceEnquiry());
			System.out.println();
			jennyCA.withdraw(2000);;
			System.out.println(jennyCA.getEligibilityAmount());
			System.out.println(jennyCA.balanceEnquiry());
			System.out.println();
			jennyCA.withdraw(2500);;
			System.out.println(jennyCA.getEligibilityAmount());
			System.out.println(jennyCA.balanceEnquiry());
			System.out.println();
			jennyCA.withdraw(4000);;
			System.out.println(jennyCA.getEligibilityAmount());
			System.out.println(jennyCA.balanceEnquiry());
			System.out.println();
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	/*
	 * public static void transaction(Account account, double amount) {
	 * account.deposit(amount); }
	 */
		
}
