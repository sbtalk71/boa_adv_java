package threads.conc;

import java.util.Map;

public class MapWriter implements Runnable {

	private Map<String, String> map;

	public MapWriter(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		try {
			for (int i = 0; i < 100; i++) {
				map.put(tname + i, tname + i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
