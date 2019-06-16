package Assignment29;

public class WellsBank {
	public static void main(String[] args) {
		Customer john = new Customer();
		john.setCustomerID(101);
		//john.customerID = 101;
		john.setCustomerName("John");
		john.setAddress("502 Steve ln, Irving");
		john.setPincode(62415);
		System.out.println(john.getCustomerID());
		System.out.println(john.getCustomerName());
		System.out.println(john.getAddress());
		System.out.println(john.getPincode());
	}
}
