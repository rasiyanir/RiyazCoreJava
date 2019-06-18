package Assignment7;

class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	final protected int semesterFees = 12000;
	protected double feesPerMonth;
	
	public Student(){
		
	}
	
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
	public void setStudentName(String fName, String lName) {
		this.studentName = fName + " " + lName;
	}
	/*
	 * public int getSemesterFees() { return semesterFees; }
	 * 
	 * public void setSemesterFees(int semesterFees) { this.semesterFees =
	 * semesterFees; }
	 */

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void calculateFees(){
		feesPerMonth = (double)semesterFees/6.0;
	}
	
	public void displayDetail(){
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
		System.out.println("Fees Per Month: " + getFeesPerMonth());
	}
}

final class DayScholar extends Student{
	private String residentialAddress;

	public DayScholar(){
		
	}
	
	public DayScholar(int sid, char sType,String sName, double feesPerMonth, String residentialAddress){
		studentId = sid;
		studentType = sType;
		studentName = sName;
		this.feesPerMonth = feesPerMonth;
		this.residentialAddress = residentialAddress;
		
	}
	
	public void displayDayDetails(){
		System.out.println("Residential Details: " + residentialAddress);
	}
	
	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
}


public class DynamicEx {
	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas", "Ward");
		dayScholar.setResidentialAddress("No 32/3 Vijayanagar");
		dayScholar.calculateFees();
		dayScholar.displayDetail();
		dayScholar.displayDayDetails();
	}
}


