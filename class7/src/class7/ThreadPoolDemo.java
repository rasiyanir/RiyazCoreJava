package class7;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	public void run() {
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
		 
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		
	}
}

public class ThreadPoolDemo {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * for(int i = 0; i < 10; i++) { Thread t1 = new Thread(new Task()); 
		 * t1.start();
		 * t1.join(); }
		 */
		
		//int coreCount = Runtime.getRuntime().availableProcessors();
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		//ExecutorService service = Executors.newCachedThreadPool();
		
		//ExecutorService service = Executors.newScheduledThreadPool(10);
		
		
		
		for(int i = 0; i < 100; i++) {
			//try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
			service.execute(new Task());
		}
	
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
}
