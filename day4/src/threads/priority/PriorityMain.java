package threads.priority;

public class PriorityMain {

	public static void main(String[] args) throws InterruptedException{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker r1=new Clicker();
		Clicker r2=new Clicker();
		Thread hi = new Thread(r1);
		
		Thread lo = new Thread(r2);
		
		hi.setPriority(Thread.NORM_PRIORITY + 2);
		lo.setPriority(Thread.NORM_PRIORITY - 2);
		
		hi.start();
		lo.start();
		
		Thread.sleep(10000);
		
		r1.stop();
		r2.stop();
		
		hi.join();
		lo.join();
		
		System.out.println("Hi Pririty Thread Ran : "+r1.click);
		System.out.println("Lo Pririty Thread Ran : "+r2.click);

	}

}
