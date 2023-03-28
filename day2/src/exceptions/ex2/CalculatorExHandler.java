package exceptions.ex2;

public class CalculatorExHandler {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		try {
		System.out.println(cal.divide(10, 0));
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
