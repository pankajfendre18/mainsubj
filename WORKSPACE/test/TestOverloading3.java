package com.test;

class Adder {
	// Method to add two integers and return an integer
	static int add(int a, int b) {
		System.out.println("int");
		return a + b;
	}

	// Method to add two integers and return a double
	static double add(double a, int b) {
		System.out.println("double");
		return a + b;
	}
}

public class TestOverloading3 {
	public static void main(String[] args) {
		// This line of code will cause ambiguity because both add methods have the same
		// signature
		System.out.println(Adder.add(11, 11)); // Error: ambiguity
	}
}