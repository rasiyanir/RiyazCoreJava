package Assignment8;

public class Wells {
	public static void main(String[] args) {
		EmployeeGrade employee1 = new EmployeeGrade();
		
		employee1.initializeEmployee(1001, "Paul Jacob", 4.3f, 3.9f, 4.4f);
		employee1.calculateAverageFeedback();
		employee1.calculateGrade();
		employee1.displayInfo();
	}
}
