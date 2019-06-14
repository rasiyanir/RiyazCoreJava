package Assignment2;

public class EmployeeGrade {
	public static void main(String[] args) {
		 int employeeId[] = {1001, 1002, 1003, 1004, 1005};
		float[] customer1Feedback = {4.1f, 3.8f, 4.5f, 4.9f, 3.9f};
		float[] customer2Feedback = {3.4f, 4.3f, 3.8f, 4.5f, 3.2f};
		float[] customer3Feedback = {4.6f, 3.1f, 3.2f, 4.6f, 3.5f};
		float[] averageFeedback = new float[5];
		char[] grade = new char[5];
		
		for(int i = 0; i < employeeId.length; i++) {
			averageFeedback[i] = (customer1Feedback[i] + customer2Feedback[i] + customer3Feedback[i])/3;
		}
		
		
		
		for(int i = 0; i < averageFeedback.length; i++) {
			if(averageFeedback[i]>4.5f) {
				grade[i] = 'A';
			}
			else if(averageFeedback[i]>4.0f) {
				grade[i] = 'B';
			}
			else if(averageFeedback[i]>3.5f) {
				grade[i] = 'C';
			}
			else {
				grade[i] = 'D';
			}
		}
		
		
		
		
		displayDetails(employeeId, averageFeedback, grade);
		
	}
	
	public static void displayDetails(int[] id, float[] avgFb, char[] Gr) {
		for(int i = 0; i < id.length; i++) {
			System.out.println("Employee Id: " + id[i] + " Average Feedback: " + avgFb[i] + " Grade: " + Gr[i]);
		}
	}
}
