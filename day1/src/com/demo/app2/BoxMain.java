package com.demo.app2;

public class BoxMain {

	public static void main(String[] args) {
		Box b1 = new Box(10, 10, 20);

		System.out.println(b1.getVolume());

		Box b2 = new Box(10, 10, 20,"Blue");

		System.out.println(b1.getVolume());
	}

}
