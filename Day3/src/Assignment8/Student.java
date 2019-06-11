package Assignment8;

public class Student {
	private int studentID;
	private String studentName;
	private String residentialStatus;
	private char studentType;
	private double feesPerMonth;
	
	
	public Student(){
		studentID = 10;
		//studentType = 'F';
	}
	
	public Student(int id, char type, String firstName, String lastName){
		studentID = id;
		studentType = type;
		studentName = firstName +  " " + lastName;
	}
	
	public int getStudentID(){
		return studentID;
	}
	
	public void setStudentID(int ID){
		studentID = ID;
	}
	
	public void setStudentName(String firstName, String lastName){
		studentName = firstName + " " +lastName;
	}
	
	
	

	public String getStudentName() {
		return studentName;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}


	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public void calculateFees(double semesterFees){
		feesPerMonth = semesterFees/6.0;
	}
	
	public void calculateFees(double semesterFees, double hostelFees){
		feesPerMonth = semesterFees/6.0;
		feesPerMonth = feesPerMonth + hostelFees;
	}
}
