package Assignment7;

public class Student {
	private int studentID;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;
	private long hostelFee;
	
	
	public Student(){
		studentID = 10;
		//studentType = 'F';
	}
	
	public Student(int id, String firstName, String lastName){
		studentID = id;
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

	public long getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	public long getHostelFee() {
		return hostelFee = 100;
	}

	public void setHostelFee(long hostelFee) {
		this.hostelFee = hostelFee;
	}

	/*public void setStudentName(String studentName) {
		this.studentName = studentName;
	}*/
}
