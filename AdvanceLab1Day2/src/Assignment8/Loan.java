package Assignment8;

public class Loan {
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	
	public Loan() {
		
	}
	
	public Loan(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest) {
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
	
}
