package exceptions.ex3;

public class ClubHouse {

	public String validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			System.out.println("You are not allowed");
			throw new InvalidAgeException("Age is less than 18");
		}else {
			return "age valid";
		}
	}
}
