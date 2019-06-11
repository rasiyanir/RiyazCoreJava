package Assignment4;

public class CourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student;
		student = new Student();
		/*student.setStudentID(3);
		student.setStudentName("John", "Doe");
		student.setStudentType('L');*/
		
		System.out.println("ID: " + student.getStudentID());
		System.out.println("Type: " + student.getstudenttype());
		System.out.println("Name: " + student.getStudentName());
		System.out.println();
		
		Student student2 = new Student(25, 'F', "Riyaz", "Rasiyani");
		
		System.out.println("ID: " + student2.getStudentID());
		System.out.println("Type: " + student2.getstudenttype());
		System.out.println("Name: " + student2.getStudentName());
	}

}
