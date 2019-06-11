package Assignment8;

public class CourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student;
		student = new Student(12, 'F', "Riyaz", "Rasiyani");
		student.setResidentialStatus("Hostelite");
		if(student.getResidentialStatus().equals("Day Scholar")){
			student.calculateFees(600);
		}
		else{
			student.calculateFees(600, 350);
		}
		
		System.out.println("ID: " + student.getStudentID());
		System.out.println("Type: " + student.getStudentType());
		System.out.println("Name: " + student.getStudentName());
		System.out.println("Residential Status: " + student.getResidentialStatus());
		System.out.println("Fees per Month: " + student.getFeesPerMonth());
		
	}

}
