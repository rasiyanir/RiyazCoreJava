package Assignment6;

public class UserInput {
	public static void main(String[] args) {
		int number, iteration;
		
		
		number = Integer.parseInt(args[0]);
		iteration = Integer.parseInt(args[1]);
		
		for(int i = 1; i < iteration; i++){
			System.out.println(number + "x" + i + " = " + (number*i));
		}
	}
}
