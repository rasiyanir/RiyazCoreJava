package class7;

class TransactionThread2 extends Thread{
	TransactionThread2() {
		System.out.println("Transaction Initialized");
	}
	
	public void run() {
		System.out.println("Processing the transaction thread");
	}
}

public class WellsBank2 {
	public static void main(String[] args) {
		System.out.println("Start of the main thread");
		TransactionThread2 transactionThread = new TransactionThread2();
		Thread thread = new Thread(transactionThread);
		thread.start();
	}
}
