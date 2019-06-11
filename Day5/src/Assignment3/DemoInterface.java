package Assignment3;



interface InterOne{
	int varOne = 20;
	int varTwo = 100;
	void methodOne();
	void methodTwo();
}

class Example implements InterOne{
	public void methodOne(){
		//varTwo = varTwo + 10;
		System.out.println("Value of varTwo: " + varTwo);
		System.out.println("Good Morning");
	}
	public void methodTwo(){
		System.out.println("Good Afternoon");
	}
}

public class DemoInterface {
	public static void main(String[] args) {
		Example obj = new Example();
		obj.methodOne();
		obj.methodTwo();
	}
}
