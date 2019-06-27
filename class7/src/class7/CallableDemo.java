package class7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task1 implements Callable<Integer>{
	

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000	);
		return new Random().nextInt();
	}
}

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//create the pool
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		//submit the task for execution
		List<Future> allFutures = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			Future<Integer> future = service.submit(new Task1());	
			allFutures.add(future);
		}

		
		//perform some unrelated operation before 3s delay.
		
		
	//	Integer result = future.get();
		
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
}
