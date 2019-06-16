package Assignment16;

public class WellsBank {
	public static void main(String[] args) {
		Customer john = new Customer(9001, "John", "124 silicon Dr, Irving", 32468);
		//Account account = new Account();
		SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
		johnSA.deposit(1000);
		System.out.println(johnSA.balanceEnquiry());
		johnSA.withdraw(1600);
		System.out.println(johnSA.balanceEnquiry());
		Customer jenny = new Customer(9002, "Jenny", "249 Beltline Dr, Irving", 304216);
		CurrentAccount jennyCA = new CurrentAccount(201, jenny, 500, 2000);
		System.out.println(jennyCA.getEligibilityAmount());
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println();
		transaction(jennyCA, 1500);
		System.out.println(jennyCA.getEligibilityAmount());
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println();
		jennyCA.withdraw(1000);
		System.out.println(jennyCA.getEligibilityAmount());
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println();
		jennyCA.withdraw(4000);
		System.out.println(jennyCA.getEligibilityAmount());
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println();
		jennyCA.withdraw(3000);
		System.out.println(jennyCA.getEligibilityAmount());
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println();
		
		
	}
	
	public static void transaction(Account account, double amount) {
		account.deposit(amount);
	}
		
}
