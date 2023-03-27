package com.demo.interfaces;

public interface Greet {

	public String getGreeting();
}

class GoodMorning implements Greet {
	@Override
	public String getGreeting() {

		return "Good Morning..";
	}
}



class GreetDemo {
	public static void main(String[] args) {
		//Greet greet = new GoodMorning();
		
		Greet greet=new Greet() {
			@Override
			public String getGreeting() {
				
				return "Good Night";
			}
		};

		System.out.println(greet.getGreeting());
	}
}
