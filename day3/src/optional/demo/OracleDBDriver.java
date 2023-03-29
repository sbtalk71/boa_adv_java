package optional.demo;

public class OracleDBDriver implements MyDBDriver {
	@Override
	public void getConnection() {
		System.out.println("Oracle DB COnnected...");

	}

	@Override
	public void showDbDetails() {
		System.out.println("Oracle DB 13.1.7");

	}
}
