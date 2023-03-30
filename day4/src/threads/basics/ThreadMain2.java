package threads.basics;

public class ThreadMain2 {

	public static void main(String[] args) throws InterruptedException{
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getName()+" started");
		Thread t1=new Thread(new MyRunnable());
		Thread t2=new Thread(new MyRunnable());
		
		System.out.println(Thread.currentThread()+","+t1+","+t2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println(Thread.currentThread().getName()+" Exited..");

	}

}
