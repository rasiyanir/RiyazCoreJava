package Assignment10c;

public class Wells {
	public static void main(String[] args) {
		//EmployeeGrade ram = new EmployeeGrade();
		
		//ram.calculateAverageFeedback();
		//ram.calculateGrade();
		//ram.displayInfo();
		//System.out.println();
		
		EmployeeGrade[] empArray = new EmployeeGrade[5];
		
		for(int i = 0; i < empArray.length; i++) {
			empArray[i] = new EmployeeGrade(101, "Ram", 3.6f, 4.0f, 4.2f);
			empArray[i].calculateAverageFeedback();
			empArray[i].calculateGrade();
			empArray[i].displayInfo();
			System.out.println();
		}
		
		
	}
}
