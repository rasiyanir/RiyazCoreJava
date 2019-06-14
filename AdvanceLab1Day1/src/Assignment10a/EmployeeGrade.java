package Assignment10a;

public class EmployeeGrade {
	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;
	
	public EmployeeGrade() {
		this.employeeNo = 101;
		this.employeeName = "Ram";
		this.customer1Feedback = 4.1f;
		this.customer2Feedback = 4.0f;
		this.customer3Feedback = 4.3f;
	}
	
	public void calculateAverageFeedback() {
		averageFeedback = (customer1Feedback + customer2Feedback + customer3Feedback)/3;
	}
	
	public void calculateGrade() {
		if(averageFeedback>4.5f) {
			grade = 'A';
		}
		else if(averageFeedback>4.0f) {
			grade = 'B';
		}
		else if(averageFeedback>3.5f) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
	}
	
	public void displayInfo() {
		System.out.println("Employee No: " + employeeNo);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Average Feedback: " + averageFeedback);
		System.out.println("Grade: " + grade);
	}
	
}
