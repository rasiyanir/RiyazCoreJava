package Assignment22;

import java.util.Vector;

public class EmployeeInfo {
	public static void main(String[] args) {
		Vector empList = new Vector();
		int empNo = 1000;
		for(int count = 0; count < 5; count++) {
			empNo++;
			Integer i = new Integer(empNo);
			empList.add(i);
		}
		
		System.out.println(empList);
	}
}
