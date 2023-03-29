package optional.demo;

import java.util.Optional;

public class InterfaceMain {

	public static void main(String[] args) {
		Optional<MyDBDriver> op = DriverFactory.getDriver("mysql");
		if (op.isPresent()) {
			MyDBDriver driver = op.get();
			driver.getConnection();
			driver.showDbDetails();
			//driver.getSupportedJavaVersion();

		}
	}

}
