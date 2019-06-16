package Assignment31;

import java.util.ArrayList;

public class EmployeeInfo {
	public static void main(String[] args) {
		ArrayList<Integer> employeeId = new ArrayList<Integer>();
		//ArrayList<int> employeeId = new ArrayList<int>();
		employeeId.add(1001);
		employeeId.add(1002);
		//employeeId.add("1003");
		
		for(int count = 0; count<employeeId.size(); count++) {
			System.out.println(employeeId.get(count));
		}
	}
}
