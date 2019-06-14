package Assignment8c;

public class Loan {
	private static int loanCounter;
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	
	static{
		loanCounter = 101;
	}
	
	public int getNumberOfObjects() {
		return loanCounter;
	}
	
	public static Loan getLoanInstance() {
		return new Loan();
		//return loan;
	}
	
	private Loan() {
		++loanCounter;
	}
	
	private Loan(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest) {
		this();
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanDuration = loanDuration;
		this.loanAmount = loanAmount;
		this.interest = interest;
	}
	
	public float calculateInstallments() {
		return 0.0f;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}
	
	
	
	public static void main(String[] args) {
		Loan loan = new Loan();
		Loan loan1 = new Loan(10001, 9001, 3, 400000, 2000);
		Loan loan2 = new Loan();
		Loan loan3 = new Loan(10001, 9001, 3, 400000, 2000);
		Loan loan4 = new Loan();
		Loan loan5 = new Loan(10001, 9001, 3, 400000, 2000);
		
		System.out.println("Number of instances: " + loanCounter);
		
	}
}
