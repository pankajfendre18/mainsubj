package com.inner;

public class localInner1 {
	private int data = 30;// instance variable

	void display() {
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		localInner1 obj = new localInner1();
		obj.display();
	}
}
