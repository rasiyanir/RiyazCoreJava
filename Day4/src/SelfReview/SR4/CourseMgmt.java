package SelfReview.SR4;

class Parent{
	private int num;
	
	Parent(int num){
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
	
}

class Child extends Parent{
	private int val;
	
	Child(int num, int val){
		super(num);
		this.val = val;
	}
	
	public int getVal(){
		return val;
	}
	
}

public class CourseMgmt {
	
	public static void main(String[] args) {
		Child child;
		
		child = new Child(100, 200);
		System.out.println("Parent: Num: " + child.getNum());
		System.out.println("Child: Val: " + child.getVal());
	}
}
