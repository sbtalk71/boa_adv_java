package optional.demo;

import java.util.Optional;

public class DriverFactory {

	public static Optional<MyDBDriver> getDriver(String dbType) {
		if(dbType.equals("mysql")) {
			return Optional.of(new MySQLDBDriver());
		}else if(dbType.equals("oracle")) {
			return Optional.of( new OracleDBDriver());
		}else {
			//throw new RuntimeException(dbType+" not supported");
			return Optional.empty();
		}
	}
}
