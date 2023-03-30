package threads.sync;

public class TableWorker implements Runnable {

	private TableGenerator tableGenerator;
	private int number;

	public TableWorker(TableGenerator tableGenerator, int number) {
		this.tableGenerator = tableGenerator;
		this.number = number;
	}

	@Override
	public void run() {
		tableGenerator.generateTable(number);

	}

}
