package com.interview;

class Parent {
	public void display() {
		System.out.println("Parent");
	}

}

class Child extends Parent {
	public void display() {

		System.out.println("Child");

	}
}

public class ParentChildExample {
	public static void main(String[] args) {
		Parent p = new Child();
		p.display();
	}

}
