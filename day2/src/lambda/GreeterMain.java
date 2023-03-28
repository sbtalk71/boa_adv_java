package lambda;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter= new Greeter();
		greeter.pringGreeting(new GoodMorning());
		
		Greet message=()->"Good Afternoon";
		greeter.pringGreeting(message);
		
		greeter.pringGreeting(()->"Good Night");

	}

}

class GoodMorning implements Greet{
	@Override
	public String getGreet() {
		
		return "Good Morning..";
	}
}