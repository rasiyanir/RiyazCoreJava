package package1;

public class Base {
	int variable1;
	private int variable2;
	protected int variable3;
	public int variable4;
	
	public Base(){
		variable1 = 100;
		variable2 = 200;
		variable3 = 300;
		variable4 = 400;
	}
	
	int getVariable() {
		return variable1;
	}
	
	public int getVariable2() {
		return variable2;
	}
	
}
