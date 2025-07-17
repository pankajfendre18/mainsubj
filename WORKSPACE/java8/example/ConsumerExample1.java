package com.java8.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {
	public static void main(String[] args) {

		Consumer<String> con1 = s -> System.out.println(s);

		con1.accept("PANKAJ");

		Consumer<List<Student>> con2 = s -> System.out.println(s);

		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "PANKAJ"));
		students.add(new Student(2, "KUNAL"));
		students.add(new Student(3, "DEEPAK"));

		con2.accept(students);

		Consumer<List<Integer>> con3 = i -> {
			for (Integer integer : i) {
				System.out.println(integer * 100);
			}
		};
		Consumer<List<Integer>> con4 = i -> {
			for (Integer integer : i) {
				System.out.println(integer);
			}
		};

		con3.andThen(con4).accept(Arrays.asList(1, 2, 3, 4, 5));
	}
}
