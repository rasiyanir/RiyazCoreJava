package class7;

class TransactionThread extends Thread{
	public void run() {
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("Transaction " + Thread.currentThread().getId() + " is being processed");
				Thread.sleep(2000);
			}
		}catch(InterruptedException interruptedException) {
			System.out.println("Transaction Interrupted");
		}
	}
}

public class WellsBank {
	public static void main(String[] args) {
		System.out.println("Welcome to WellsBank's main Thread");
		TransactionThread [] transactionThread = {new TransactionThread(), new TransactionThread(), new TransactionThread()};
		for(int i = 0; i < transactionThread.length; i++) {
			transactionThread[i].start();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	//	System.out.println("Bye");
	}
}
