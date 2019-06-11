package SelfReview.SR2;

interface Count{
	short counter = 0;
	void countUp();
}

public class TestCount implements Count{
	public static void main(String[] args) {
		TestCount test = new TestCount();
		test.countUp();
	}
	public void countUp(){
		for(int x = 6; x > counter;x--){
			System.out.println(" " + counter);
		}
	}
}
