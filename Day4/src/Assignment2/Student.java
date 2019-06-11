package Assignment2;

public class Student {
	protected int studentID;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	public Student(){
		
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
	
	
	public static void main(String[] args) {
		Hostelite hostelite = new Hostelite(3, 'L', "Riyaz", "Rasiyani", 1200, "UHCL", 203);
		System.out.println("StudentID: " + hostelite.getStudentID());
		System.out.println("studentType: " + hostelite.getStudentType());
		System.out.println("StudentName: " + hostelite.getStudentName());
		System.out.println("FeesPerMonth: " + hostelite.getFeesPerMonth());
		System.out.println("HostelName: " + hostelite.getHostelName());
		System.out.println("RoomNumber: " + hostelite.getRoomNumber());
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
