package exceptions.ex2;

import javax.management.RuntimeErrorException;

public class Calculator {

	public double divide(int a, int b) {
		double result = 0;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Exception : " + e.getMessage());
			throw new RuntimeException("Some Exception");
		}
		return result;
	}

}
