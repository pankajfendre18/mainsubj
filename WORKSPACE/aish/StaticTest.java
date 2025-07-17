package com.aish;

public class StaticTest {
	static {
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Initializer Block");
	}

	public StaticTest() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		 new StaticTest();
	}

}
