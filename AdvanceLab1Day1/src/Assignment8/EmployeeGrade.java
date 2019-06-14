package Assignment8;

public class EmployeeGrade {
	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;
	
	public void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feedback = customer2Feedback;
		this.customer3Feedback = customer3Feedback;
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
