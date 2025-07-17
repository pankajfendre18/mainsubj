package com.inner;

abstract class Person {
	abstract void eat();
}

public class TestAnonymousInner {
	public static void main(String args[]) {
		new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		}.eat();
		//p.eat();
	}
}
