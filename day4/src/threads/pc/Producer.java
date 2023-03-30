package threads.pc;

public class Producer implements Runnable {

	private SharedQueue queue;

	private int num = 0;

	public Producer(SharedQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				queue.put(num++);
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
