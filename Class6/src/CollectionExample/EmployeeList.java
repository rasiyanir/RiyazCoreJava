package CollectionExample;

import java.util.List;

class Employee{}

public class EmployeeList {
	public static void populateList(List list) {
		list.add("System Engineer");
		list.add(new Integer(112233));
		list.add(new Employee());
	}
	
	public static void main(String[] args) {
		List a = null;
		EmployeeList.populateList(a);
		for(int index = 0; index < a.size(); index++) {
			System.out.println("" + index+":" + a.get(index));
		}
	}
}
