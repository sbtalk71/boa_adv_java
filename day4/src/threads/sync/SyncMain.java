package threads.sync;

public class SyncMain {

	public static void main(String[] args) throws InterruptedException {
		MessagePrinter mp= new MessagePrinter();
		
		Thread t1= new Thread(new PrintWorker(mp, "Hello"));
		Thread t2= new Thread(new PrintWorker(mp, "Good"));
		Thread t3= new Thread(new PrintWorker(mp, "World"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}

}
