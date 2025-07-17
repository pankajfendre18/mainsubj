package com.interview;

@FunctionalInterface
interface FunctionalInterface1 {
	void print();
}

@FunctionalInterface
interface FunctionalInterface2 {
	void display();
}

public class DemoFunctionalInterface {

	public static void main(String[] args) {

		FunctionalInterface1 f = () -> {
			System.out.println("printing");
		};

		f.print();
	}

}
