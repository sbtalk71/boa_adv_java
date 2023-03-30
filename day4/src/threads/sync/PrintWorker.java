package threads.sync;

public class PrintWorker implements Runnable{

	private MessagePrinter messagePrinter;
	private String message;
	
	public PrintWorker(MessagePrinter messagePrinter, String message) {
		this.messagePrinter = messagePrinter;
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (messagePrinter) {
			messagePrinter.print(message);
		}
		
		
	}

}
