package com.ey.ms;

interface I1 {
	default void display() {
		System.out.println("I1 display");
	}
}

interface I2 {
	default void display() {
		System.out.println("I2 display");
	}
}

class MyClass implements I1, I2 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		I1.super.display();
	}

}

public class InterfaceExample1 {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.display();
	}
}
