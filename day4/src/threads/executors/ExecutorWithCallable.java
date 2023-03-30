package threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorWithCallable {

	public static void main(String[] args) throws Exception{
		
		ExecutorService es= Executors.newCachedThreadPool();
		Future<String> result= es.submit(new CaseChanger("shantanu"));
		System.out.println("Call done...");
		
		while(!result.isDone()) {
			System.out.println("waiting for result..");
			Thread.sleep(2000);
		}
		
		System.out.println("Result : "+result.get());
		es.shutdown();

		
	}

}
