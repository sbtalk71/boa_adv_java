package threads.basics;

public class ThreadMain1 {

	public static void main(String[] args) throws InterruptedException{
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getName()+" started");
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		
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
