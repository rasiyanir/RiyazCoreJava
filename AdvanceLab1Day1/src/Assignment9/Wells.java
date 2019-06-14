package Assignment9;

public class Wells {
	public static void main(String[] args) {
		EmployeeGrade employee1 = new EmployeeGrade();
		
		employee1.initializeEmployee(1001, "Elvis", 4.1f, 3.9f, 4.2f);
		employee1.calculateAverageFeedback();
		employee1.calculateGrade();
		employee1.displayInfo();
		System.out.println();
		employee1.initializeEmployee(1001, "Martha", 4.2f, 3.4f);
		employee1.calculateAverageFeedback();
		employee1.calculateGrade();
		employee1.displayInfo();
	}
}
