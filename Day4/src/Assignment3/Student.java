package Assignment3;

public class Student {
	protected int studentID;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	protected String residentialStatus;
	
	public Student(){
		
	}
	
	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public Student(int id, char type, String firstName, String lastName){
		studentID = id;
		studentType = type;
		studentName = firstName + " " +lastName;
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String firstName, String lastName) {
		studentName = firstName + lastName;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void displayStudentDetails(){
		System.out.println("StudentID: " + getStudentID());
		System.out.println("studentType: " + getStudentType());
		System.out.println("StudentName: " + getStudentName());
		System.out.println("FeesPerMonth: " + getFeesPerMonth());	
	}
	
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setResidentialStatus(args[0]);
		
		if(student.getResidentialStatus().equalsIgnoreCase("Hostelite")){
			student = new Hostelite(1, 'F', "Leon", "Ward", 2000, "UHCL", 201);
			student.displayStudentDetails();
		}
		else{
			student = new DayScholar(2, 'L', "Riyaz", "Rasiyani", 1000, "322 Bay Area Ln, Houston, Tx-77321");
			student.displayStudentDetails();
		}

	}
	
	
}

class Hostelite extends Student{
	private String hostelName;
	

	private int roomNumber;
	
	public Hostelite(){
		
	}
	
	public Hostelite(int id, char type, String fName, String lName, double fee, String hostelName, int rNumber){
		super(id, type, fName, lName);
		super.setFeesPerMonth(fee);
		this.hostelName = hostelName;
		roomNumber = rNumber;
		
	}
	
	public void displayStudentDetails(){
		super.displayStudentDetails();
		System.out.println("HostelName: " + getHostelName());
		System.out.println("RoomNumber: " + getRoomNumber());
	}
	
	
	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
}


class DayScholar extends Student{
	private String residentialAddress;
	
	public DayScholar(int id, char type, String fName, String lName, double fee, String rAddress){
		super(id, type, fName, lName);
		super.setFeesPerMonth(fee);
		setResidentialAddress(rAddress);
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public void displayStudentDetails(){
		super.displayStudentDetails();
		System.out.println("ResidentialAddress: " + getResidentialAddress());

	}
	
	
}