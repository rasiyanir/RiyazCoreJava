package Assignment30;

import java.util.*;

public class EmployeeInfo {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		
		employee1.setEmployeeID(1001);
		employee2.setEmployeeID(1002);
		employee3.setEmployeeID(1003);
		employee4.setEmployeeID(1004);
		
		employee1.setEmployeeName("Riyaz");
		employee2.setEmployeeName("John");
		employee3.setEmployeeName("Jason");
		employee4.setEmployeeName("Mary");
		
		
		
		
		List list = new ArrayList();
		
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		
		
		for(Object l: list) {
			System.out.println(l);
		}
		
		System.out.println();
		 Iterator iterator = list.iterator();
		  
		 while(iterator.hasNext()) { System.out.println(iterator.next()); }
		 
		
		
	}
}
