package Assignment11;

public class Wells {
	public static void main(String[] args) {
		EmployeeGrade ram = new EmployeeGrade();
		
		ram.calculateAverageFeedback();
		ram.calculateGrade();
		ram.displayInfo();
		System.out.println();
		
		EmployeeGrade james = new EmployeeGrade(102, "James", 4.2f, 4.4f, 4.1f);
		
		james.calculateAverageFeedback();
		james.calculateGrade();
		james.displayInfo();
	}
}
