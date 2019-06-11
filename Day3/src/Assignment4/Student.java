package Assignment4;

public class Student {
	private int studentID;
	private char studentType;
	private String studentName;
	
	public Student(){
		studentID = 10;
		studentType = 'F';
	}
	
	public Student(int id, char type, String firstName, String lastName){
		studentID = id;
		studentType = type;
		studentName = firstName +  " " + lastName;
	}
	
	public int getStudentID(){
		return studentID;
	}
	
	public void setStudentID(int ID){
		studentID = ID;
	}
	
	public void setStudentName(String firstName, String lastName){
		studentName = firstName + " " +lastName;
	}
	
	public char getstudenttype(){
		return studentType;
	}
	
	public void setStudentType(char type){
		studentType = type;
	}
	

	public String getStudentName() {
		return studentName;
	}

	/*public void setStudentName(String studentName) {
		this.studentName = studentName;
	}*/
}
