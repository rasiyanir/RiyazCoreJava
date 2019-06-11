package Assignment5;
import java.util.Scanner;

public class JavaDoc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String userName;
		
		System.out.println("Please enter a User Name: ");
		
		userName = input.nextLine();
		
		System.out.println(userName.length());
		
		System.out.println("Hi " + userName);
		
		System.out.println(userName.toLowerCase());
		
		System.out.println(userName.toUpperCase());
		
		System.out.println(userName.startsWith("a"));
		
		System.out.println(userName.replaceAll(userName, "KRISHNA"));
		
		
	}
}
