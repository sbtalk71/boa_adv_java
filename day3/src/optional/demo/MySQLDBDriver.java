package optional.demo;

public class MySQLDBDriver implements MyDBDriver {
	@Override
	public void getConnection() {
		System.out.println("MySQL DB COnnected...");

	}

	@Override
	public void showDbDetails() {
		System.out.println("MySQL DB 8.1.7");

	}

	
	
	
}
