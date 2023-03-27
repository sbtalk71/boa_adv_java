package com.demo.abstractdemo;

public class Main1 {

	public static void main(String[] args) {
		Animal animal=null;
		
		animal= new Cat("Jonny");
		
		animal.talk();
		
		animal=new Dog("Fido");
		
		animal.talk();
		

	}

}
