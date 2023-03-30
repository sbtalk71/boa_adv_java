package threads.pc;

public class PCMain {

	public static void main(String[] args) throws Exception {
		SharedQueue queue = new SharedQueue();
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));

		producer.start();
		consumer.start();
		
		producer.join();
		consumer.join();

	}

}
