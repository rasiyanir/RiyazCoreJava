package Assignment5;

public class Student {
	private int studentID;
	private char studentType;
	
	public Student(){
		//studentID = 10;
		studentType = 'F';
	}
	
	public void setStudentID(int ID){
		studentID = ID;
	}
	
	public int getStudentID(){
		return studentID;
	}
	
	public void setStudentType(char type){
		studentType = type;
	}
	
	public char getstudenttype(){
		return studentType;
	}
}
