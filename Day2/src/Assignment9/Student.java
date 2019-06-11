package Assignment9;

public class Student {

	private static int studentID = 550;
	private char studentType;
	private String studetName;
	
	public Student(){
		//studentID = 550;
		++studentID;
	}
	
	public Student(char sType, String fname, String lname){
		this();
		studetName = fname + lname;
		studentType = sType;
	}
	
	public void displayDetails(Student stu){
		System.out.println(studentID);
		System.out.println(stu.studentType);
		System.out.println(stu.studetName);
	}
	
	public static void main(String[] args) {
		Student studentOne = new Student('J', "Bony", "Thomas");
		
		studentOne.displayDetails(studentOne);
		
		Student studentTwo = new Student('H', "Dinil", "Bose");
		
		studentTwo.displayDetails(studentTwo);
		
		Student studentTh = new Student('H', "Dinil", "Bose");
		
		studentTh.displayDetails(studentTh);
	}
}
