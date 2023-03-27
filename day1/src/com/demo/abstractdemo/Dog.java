package com.demo.abstractdemo;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println(super.getName()+" barks");
	}
}
