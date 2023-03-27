package com.demo.app2;

public class OverLoadApp {

	public void add() {
		System.out.println("nothing to add");
	}
	/*
	 * public int add(int a, int b) { System.out.println("add for int and int..");
	 * return a+b; }
	 */
	
	public double add(int a, float b) {
		System.out.println("add for int and float..");
		return a+b;
	}
	
	public void add(double a, double b) {
		System.out.println("add for double and double..");
		
	}
	
	public static void main(String[] args) {
		OverLoadApp o = new OverLoadApp();

		o.add();
		o.add(2,3);
		o.add(2,3.0f);
		o.add(2.0,3.1);
	}

}
