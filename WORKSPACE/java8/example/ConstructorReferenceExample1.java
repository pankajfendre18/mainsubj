package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceExample1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("PANKAJ", "KUNAL", "DEEPAK");

		List<Student> students = names.stream().map(Student::new).collect(Collectors.toList());

		students.forEach(x -> System.out.println(x));

	}

}
