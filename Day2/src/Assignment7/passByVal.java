	package Assignment7;

public class passByVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sID = 20;
		passByVal val = new passByVal();
	//	passByVal val1 = new passByVal();
		System.out.println(sID);
		Assignment5.Student s = new Assignment5.Student();
		val.passTheValueMethod(s);
		System.out.println("The sID are " + sID);
	}
	
	public void passTheValueMethod(Assignment5.Student student){
		student.setStudentID(10);
		System.out.println("The sID are " + student.getStudentID());
	}

}
