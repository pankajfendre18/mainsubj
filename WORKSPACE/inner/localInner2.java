package com.inner;

public class localInner2 {
	private int data = 30;// instance variable

	void display() {
		int data = 50;// local variable must be final till jdk 1.7 only
		class Local {
			void msg() {
				localInner2 obj = new localInner2();
				System.out.println(obj.data);
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		localInner2 obj = new localInner2();
		obj.display();
	}

}
