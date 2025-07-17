package com.test;

class Animal {
	void display() {
		System.out.println("Animal");
	}
}

public class Dog extends Animal {

	void display() {
		System.out.println("Dog");
	}

	public static void main(String[] args) {
		Animal a = new Dog();
//		a.display();

		Dog d = (Dog) a;
		d.display();
	}

}
