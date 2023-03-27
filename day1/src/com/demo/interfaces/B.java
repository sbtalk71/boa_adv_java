package com.demo.interfaces;

public interface B {
	default void f1() {
		System.out.println("B.f1()");
	}
}
