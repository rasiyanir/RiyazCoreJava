package Assignment4;

public class Customer {
	private String customerID;
	private String customerName;
	private String address;
	private int pincode;
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.customerID = "1234";
		customer.customerName = "Jayant";
		customer.address = "PHA-Sawan Apts., Yadavgiri, Mysore";
		customer.pincode = 570020;
		System.out.println("Customer ID: " + customer.customerID);
		System.out.println("Customer Name: " + customer.customerName);
		System.out.println("Customer Address: " + customer.address);
		System.out.println("Pincode: " + customer.pincode);
	}
	
}
