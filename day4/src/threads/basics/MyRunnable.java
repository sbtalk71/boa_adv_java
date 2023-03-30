package threads.basics;

public class MyRunnable implements Runnable {
	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()+" started");
		try {

			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" Exited");
	}
}
