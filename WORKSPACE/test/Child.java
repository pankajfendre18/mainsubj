package com.test;

class Parent {

//	public Parent() {
//		System.out.println("PARENT CONSTRUCTOR");
//	}
//
//	static {
//		System.out.println("PARENT STATIC");
//	}
//
//	{
//		System.out.println("PARENT IIB");
//	}

	public Object display() {
		System.out.println("PARENT");
		return "PARENT";
	}

	public void print(Object o) {
		System.out.println("PARENT");
	}
}

public class Child extends Parent {

//	public Child() {
//		System.out.println("CHILD CONSTRUCTOR");
//	}
//
//	static {
//		System.out.println("CHILD STATIC");
//	}
//
//	{
//		System.out.println("CHILD IIB");
//	}

	public String display() {
		System.out.println("CHILD");
		return "CHILD";

	}

	public void print(Integer i) {
		System.out.println("CHILD");
	}

	public static void main(String[] args) {
//		System.out.println("MAIN METHOD");
		Child c = new Child();
		c.print(null);
//		c.display();

	}

}
