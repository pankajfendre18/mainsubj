package com.java8.example;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		List<String> students = Arrays.asList("PANKAJ", "KUNAL", "DEEPAK");
		MethodReferenceExample1 obj = new  MethodReferenceExample1();
		students.forEach(obj::print);
		
	}

	public void print(String str) {
		System.out.print(str + " ");
	}
}
