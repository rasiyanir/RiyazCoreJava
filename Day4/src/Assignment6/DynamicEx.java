package Assignment6;

class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void getDetails(){
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
		
	}
}

class DayScholar extends Student{
	private String residentialAddress;

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void getDetails(){
		super.getDetails();
		System.out.println("Student Name: " + studentName);
		System.out.println("Residential Address: " + residentialAddress);
	}
}


public class DynamicEx {
	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		dayScholar.setResidentialAddress("No 32/3 Vijayanagar");
		dayScholar.getDetails();
	}
}


