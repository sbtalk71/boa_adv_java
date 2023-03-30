package threads.pc;

public class Consumer implements Runnable {

	private SharedQueue sharedQueue;

	public Consumer(SharedQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				sharedQueue.get();
				Thread.sleep(200);

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
