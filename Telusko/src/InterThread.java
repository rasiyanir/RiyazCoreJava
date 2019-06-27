
class Q{
	int num;
	boolean valueSet = false;
	
	public synchronized void getNum() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Get : " + num);
		valueSet = false;
		notify();
	}

	public synchronized void setNum(int num) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Set : " + num);
		this.num = num;
		valueSet = true;
		notify();
	}	
}

class Producer implements Runnable{
	Q q;

	public Producer(Q q) {
		super();
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}
	
	public void run() {
		int i = 0;
		while(true) {
			q.setNum(i++);
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

class Consumer implements Runnable{
	Q q;
	
	public Consumer(Q q) {
		super();
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}
	
	public void run() {
		while(true) {
			q.getNum();
			try {Thread.sleep(5000);}catch(Exception e) {}
		}
	}
}


public class InterThread {
	public static void main(String[] args) {
		Q q = new Q();
		
		new Producer(q);
		new Consumer(q);
	}
}
