package Assignment5;

public class Student {
	protected static int studentID;
	protected char studentType;
	protected String  studentName;
	
	public Student(){
		++studentID;
	};
	
	public Student(char sType, String sName){
		this();
		studentType = sType;
		studentName = sName;
	}
	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar('D', "Manu", 5, "OOP", 18000,  "NO 32/4 Vijayanagar");
		dayScholar.calculateFees();
		dayScholar.displayStudentDetials();
		DayScholar dayScholar1 = new DayScholar('D', "Manu",5, "OOP", 18000, "NO 32/4 Vijayanagar");
		dayScholar1.calculateFees();
		dayScholar1.displayStudentDetials();
		
		
	}
}

class PostGradStudent extends Student{
	protected int postCourseID;
	protected String courseName;
	protected int postCourseFees;
	
	


	public PostGradStudent(char sType, String sName, int pCourseId, String pCourseName, int pCourseFees){
		super(sType, sName);
		setPostCourseID(pCourseId);
		setCourseName(pCourseName);
		setPostCourseFees(pCourseFees);
	}
	
	public int getPostCourseID() {
		return postCourseID;
	}

	public void setPostCourseID(int postCourseID) {
		this.postCourseID = postCourseID;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getPostCourseFees() {
		return postCourseFees;
	}

	public void setPostCourseFees(int postCourseFees) {
		this.postCourseFees = postCourseFees;
	}
	
	public void displayStudentDetails(){
		System.out.println("student ID: " + studentID + 
							"\nStudent Type: " + studentType + 
							"\nStudent Name: " + studentName + 
							"\nPostGrad Course ID: " + postCourseID + 
							"\nPostGrad Course Name: " + courseName +
							"\nPostGrad Course Fee: " + postCourseFees);
	}
	
	
	
}

class DayScholar extends PostGradStudent{
	private String residentialAddress;
	private double fee;
	
	public DayScholar(char sType, String sName,int pCourseId, String pCourseName, int pCourseFees,  String rAddress){
		super(sType, sName, pCourseId, pCourseName, pCourseFees );
		residentialAddress = rAddress;
	}
	
	public void calculateFees(){
		fee = (double)postCourseFees/6;
	}
	
	public int getFees(){
		return super.getPostCourseFees();
	}
	
	public double getFee() {
		return fee;
	}

	public void setFees(double fee) {
		this.fee = fee;
	}
	
	public String getResidentialAddress(){
		return residentialAddress;
	}
	
	public void setResidentialAddess(String residentialAddress){
		this.residentialAddress = residentialAddress;
	}
	
	public void displayStudentDetials(){
		super.displayStudentDetails();
		System.out.println("Residential Addess: " + residentialAddress +
							"\nFee: " + fee);
	}
}
