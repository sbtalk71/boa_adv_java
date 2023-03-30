package threads.executors;

import java.util.concurrent.Callable;

public class CaseChanger implements Callable<String> {

	private String data;

	public CaseChanger(String data) {
		this.data = data;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(5000);
		return data.toUpperCase();
	}

}
