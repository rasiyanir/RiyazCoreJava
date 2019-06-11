package Assignment4b;

class CourseRegistration{
	static protected int regID;
	protected String courseName;
	CourseRegistration(){
		regID++;
	}
	CourseRegistration(String cName){
		this();
		courseName = cName;
		
	}
	
	public void displayDetails(){
		System.out.println("Registration ID : " + regID);
		System.out.println("CourseName : " + courseName);
	}
}

class Student extends CourseRegistration{
	protected int studentID;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	Student(int studentID, String cName){
		super(cName);
		this.studentID = studentID;
	}
	
	Student(int studentID, char studType, String studName, int semFees, String cName){
		this(studentID, cName);
		studentType = studType;
		studentName = studName;
		semesterFees = semFees;
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println(studentID + "\n" + studentName + "\n" + semesterFees);
	}
	
	
	
}

class DayScholar extends Student{
	private String residentialAddress;
	DayScholar(int studentID, char studentType, String studName, int semFees, String residentialAddess, String cName){
		super(studentID, studentType, studName, semFees, cName);
		this.residentialAddress = residentialAddess;
		
	}
	public void displayDetails(){
		super.displayDetails();
		System.out.println(residentialAddress);
	}
}

public class CourseReg {
	public static void main(String args[]){
		DayScholar dayScholar = new DayScholar(1001, 'D', "Eugene", 12000, "No 32/68 Vijayanagar", "OOP");
		dayScholar.displayDetails();
	}
}
