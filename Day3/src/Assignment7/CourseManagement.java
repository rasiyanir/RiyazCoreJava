package Assignment7;

public class CourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student;
		student = new Student();
		
		
		student.setStudentID(Integer.parseInt(args[0]));
		student.setStudentName(args[1], args[2]);
		student.setResidentialStatus(args[3]);
		student.setFeesPerMonth(Integer.parseInt(args[4]));
		
		if(student.getResidentialStatus().equals("Hostelite")){
			System.out.println("ID: " + student.getStudentID());
			System.out.println("Name: " + student.getStudentName());
			System.out.println("ResidentialStatus: " + student.getResidentialStatus());
			System.out.println("MonthlyFee: " + (student.getFeesPerMonth() + student.getHostelFee()));
			System.out.println();
		}
		else{
			System.out.println("ID: " + student.getStudentID());
			System.out.println("Name: " + student.getStudentName());
			System.out.println("ResidentialStatus: " + student.getResidentialStatus());
			System.out.println("MonthlyFee: " + student.getFeesPerMonth());
			System.out.println();
		}
		
		
	}

}
