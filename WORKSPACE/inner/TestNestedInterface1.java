package com.inner;

interface Showable {
	void show();

	interface Message {
		void msg();
	}
}

public class TestNestedInterface1 implements Showable, Showable.Message {
	public void msg() {
		System.out.println("msg method");
	}

	public static void main(String args[]) {
//		Showable.Message message = new TestNestedInterface1();// upcasting here
//		message.msg();
		new TestNestedInterface1().show();
		new TestNestedInterface1().msg();
	}

	public void show() {
		System.out.println("show method");
	}
}
