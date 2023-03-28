package exceptions.ex3;

public class Main {

	public static void main(String[] args) {
		ClubHouse ch= new ClubHouse();
		
			try {
				System.out.println(ch.validateAge(17));
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
