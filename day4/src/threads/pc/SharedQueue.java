package threads.pc;

public class SharedQueue {
	private int data;
	volatile boolean valueSet = false;

	public synchronized void put(int data) {
		if (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		this.valueSet = true;
		System.out.println("put : " + data);
		notifyAll();
	}

	public synchronized void get() {
		if (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Got : " + data);
		this.valueSet = false;
		notifyAll();
	}
}
