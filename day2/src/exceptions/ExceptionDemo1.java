package exceptions;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;
			double d = a / b;
			int[] nums = { 1, 2, 3, 4 };
			System.out.println(nums[4]);

			String[] names = new String[4];
			System.out.println(names[0].length());

			System.out.println("No Exception here..");
		} catch (ArithmeticException ex) {
			System.out.println("Catch: " + ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Catch: " + ex);
		} catch (Exception ex) {
			System.out.println("Catch: " + ex.getMessage());
		} finally {
			System.out.println("Finally executed...");
		}
		System.out.println("Normal execution...");

	}
}
