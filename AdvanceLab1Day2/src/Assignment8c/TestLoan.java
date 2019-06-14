package Assignment8c;

public class TestLoan {
	public static void main(String[] args) {
		Loan l1 = Loan.getLoanInstance();
		System.out.println("Total number of objects: " +  l1.getNumberOfObjects());
	}
}
