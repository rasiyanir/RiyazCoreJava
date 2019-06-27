package Question3;

public class Test {
	public static void main(String[] args) {
		Account account1 = new Account(111, 100);
		Account account2 = new Account(222, 200);
		Account account3 = new Account(333, 100);
		
		try {
			account1.deposit(200);
		} catch (NegativeAmountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		try {
				account2.withdraw(300);
		}catch(InsufficientBalanceException e1) {
			System.out.println(e1.getMessage());
		}
		
		System.out.println();

		try {
			account3.deposit(-100);
		} catch (NegativeAmountException e2) {
			// TODO Auto-generated catch block
			System.out.println(e2.getMessage());
		}
		
		System.out.println();
		System.out.println("Total Number of Accounts: " + Account.totalAccounts);
		
	}
}
