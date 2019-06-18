package Assignment8;

public class Employee {
		int employeeID = 22;
		int employeeSalary = 14000;
		boolean situation1;
		boolean situation2;
		public static void main(String[] args) {
			int employeeID = 22;
			int employeeSalary = 14000;
			Employee employee = new Employee();
			boolean situation1 = employee.checkEmployeeID(employeeID);
			boolean situation2 = employee.checkEmployeeSalary(employeeSalary);
			
			if(situation1 == true && situation2== true){
				System.out.println(" Is a new employee");
			}
			else
			{
				System.out.println(" Is not a new employee");
			}
			
		}
		
		public boolean checkEmployeeID(int id){
			if(id > 20 && id < 30){
				return true;
			}
			else{
				return false;
			}
		}
		
		public boolean checkEmployeeSalary(int salary){
			if(salary>=14000 && salary < 20000){
				return true;
			}
			else{
				return false;
			}
		}
}
