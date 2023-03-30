package threads.conc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		//Map<String, String> map = new HashMap<>();
		Map<String, String> map = new ConcurrentHashMap<>();

		Thread t1 = new Thread(new MapWriter(map));
		Thread t2 = new Thread(new MapWriter(map));
		Thread t3 = new Thread(new MapWriter(map));

		t1.start();
		
		t2.start();
		
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Map Size : "+map.size());

	}

}
