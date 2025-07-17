package com.interview;

public class StringQuestions1 {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hel" + "lo";
		String c = new String("Hello");
		String d = "Hel";
		String e = d + "lo";
		String f = e.intern();

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
		System.out.println(a == e);
		System.out.println(a == f);
	}

}
