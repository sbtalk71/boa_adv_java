package threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import threads.basics.MyRunnable;

public class SimpleExecutorDemo {

	public static void main(String[] args) {
		//ExecutorService es=Executors.newSingleThreadExecutor();
		//ExecutorService es=Executors.newFixedThreadPool(4);
		ExecutorService es=Executors.newCachedThreadPool();
		
		es.execute(new MyRunnable());
		es.execute(new MyRunnable());
		es.execute(new MyRunnable());
		es.execute(new MyRunnable());

		es.shutdown();

	}

}
