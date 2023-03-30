package threads.sync;

public class TableMain {

	public static void main(String[] args) throws InterruptedException{
		TableGenerator tableGenerator=new TableGenerator();
		Thread t1=new Thread(new TableWorker(tableGenerator, 5));
		Thread t2=new Thread(new TableWorker(tableGenerator, 6));
		Thread t3=new Thread(new TableWorker(tableGenerator, 8));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

	}

}
