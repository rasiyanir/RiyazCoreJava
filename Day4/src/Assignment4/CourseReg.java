package Assignment4;

class Student{
	protected int studentID;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	Student(int studentID){
		this.studentID = studentID;
	}
	
	Student(int studentID, char studType, String studName, int semFees){
		this(studentID);
		studentType = studType;
		studentName = studName;
		semesterFees = semFees;
	}
	
	void displayDetails(){
		System.out.println(studentID + "\n" + studentType + "\n" + studentName + "\n" + semesterFees);		
	}
}

class DayScholar extends Student{
	private String residentialAddress;
	DayScholar(int studentID, char studentType, String studName, int semFees, String residentialAddess){
		super(studentID, studentType, studName, semFees);
		this.residentialAddress = residentialAddess;
		
	}
	void displayDetails(){
		super.displayDetails();
		System.out.println(residentialAddress);
	}
}

public class CourseReg {
	public static void main(String args[]){
		DayScholar dayScholar = new DayScholar(1001, 'D', "Eugene", 12000, "No 32/68 Vijayanagar");
		dayScholar.displayDetails();
	}
}
