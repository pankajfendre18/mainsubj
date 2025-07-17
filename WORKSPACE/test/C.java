package com.test;

public class C implements A1, B1 {

	public static void main(String[] args) {
		C c = new C();
		c.method();
	}

	@Override
	public void method() {
		System.out.println("Hello");

	}

}
