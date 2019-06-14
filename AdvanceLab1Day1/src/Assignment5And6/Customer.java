package Assignment5And6;

public class Customer {
	private static int customerID;
	private static int accountNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;
	private String emailID;
	private String accountType;
	
	private char gender;
	private String maritalStatus;
	
	Customer(){
		++customerID;
		++accountNumber;
	}
	
	Customer(String fName, String mName, String lName, String dob, String emID, String aType, char gend, String mStatus){
		this();
		firstName = fName;
		middleName = mName;
		lastName = lName;
		dateOfBirth = dob;
		emailID = emID;
		accountType = aType;
		gender = gend;
		maritalStatus = mStatus;
	}
	
	public void displayDetails() {
		System.out.println("CustomerID: " + customerID);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Customer Name: " + firstName + " " + middleName + " " + lastName);
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Email-ID: " + emailID);
		System.out.println("Account Type: " + accountType);
		System.out.println("Gender: " + gender);
		System.out.println("Marital Status: " + maritalStatus);
	}
	
	public static void main(String[] args) {
		Customer cust1 = new Customer("Paul", "J", "Anderson", "3rd Jan, 1985", "Paul@Wellsfargo.com", "Salary", 'M', "Single");
		cust1.displayDetails();
		System.out.println();
		Customer cust2 = new Customer("John", "", "Jacob", "6th Mar, 1985", "John@Wellsfargo.com", "Non-Salary", 'M', "Married");
		cust2.displayDetails();
	}
	
}
