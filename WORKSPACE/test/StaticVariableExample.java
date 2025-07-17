package com.test;

class Student {
	// static variable
	static int age;

	public Student(int age) {
		Student.age = age;
	}

	@Override
	public String toString() {
		return "" + age;
	}

}

public class StaticVariableExample {
	public static void main(String args[]) {
		Student s1 = new Student(24);
		System.out.println(s1.age);
		Student s2 = new Student(23);
		System.out.println(s2.age);
//		s1.age = 24;
//		s2.age = 21;
//		Student.age = 23;
		System.out.println("S1\'s age is: " + s1.age);
		System.out.println("S2\'s age is: " + s2.age);
	}
}