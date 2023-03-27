package com.demo.abstractdemo;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println(super.getName()+" mews");
	}
}
