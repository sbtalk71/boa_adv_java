package optional.demo;

public interface MyDBDriver {
	String releaseVersion = "1.0.2.rc";

	public void getConnection();

	public void showDbDetails();

	default public void getSupportedJavaVersion() {
		throw new UnsupportedOperationException();
	}
}
