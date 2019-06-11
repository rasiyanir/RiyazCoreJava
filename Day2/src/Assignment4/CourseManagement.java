package Assignment4;

public class CourseManagement {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentID(20);
		System.out.print(student.getStudentID());
		System.out.println();
		student.setStudentType('F');
		System.out.println(student.getStduentType());
		
		
	}
}
