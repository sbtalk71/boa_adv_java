package threads.sync;

public class MessagePrinter {

	public void print(String message) {
		try {
			System.out.print("["+message);
			Thread.sleep(5000);
			System.out.println("]");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
