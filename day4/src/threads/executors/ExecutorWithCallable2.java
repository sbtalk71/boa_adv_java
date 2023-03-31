package threads.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorWithCallable2 {

	public static void main(String[] args) throws Exception {

		// ExecutorService es= Executors.newCachedThreadPool();

		ThreadPoolExecutor es = (ThreadPoolExecutor) Executors.newCachedThreadPool();

		ArrayList<CaseChanger> dataSet = new ArrayList<>();
		dataSet.add(new CaseChanger("Hello World"));
		dataSet.add(new CaseChanger("Good Morning"));
		dataSet.add(new CaseChanger("Hi there"));
		dataSet.add(new CaseChanger("Well done"));

		List<Future<String>> futuresList = es.invokeAll(dataSet);

		do {
			System.out.println("Waiting for Result");
			Thread.sleep(500);
		} while (es.getCompletedTaskCount() < futuresList.size());

		for (Future<String> f : futuresList) {
			System.out.println(f.get());
		}
		es.shutdown();

	}

}
