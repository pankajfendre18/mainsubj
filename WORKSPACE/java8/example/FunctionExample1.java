package com.java8.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample1 {
	public static void main(String[] args) {
		Function<String, String> fun1 = s -> s.toUpperCase();

		System.out.println(fun1.apply("pankaj"));

		Function<String, String> fun2 = s -> s.substring(0, 3);
		System.out.println(fun2.apply("pankaj"));

		Function<List<Student>, List<Student>> fun3 = li -> {
			List<Student> resultList = new ArrayList<>();

			for (Student st : li) {
				if (fun2.apply(st.getName()).equalsIgnoreCase("PAN")) {
					resultList.add(st);
				}
			}

			return resultList;
		};

		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "PANKAJ"));
		students.add(new Student(2, "KUNAL"));
		students.add(new Student(3, "DEEPAK"));

		List<Student> apply = fun3.apply(students);
		System.out.println(apply);

		Function<Integer, Integer> fun4 = i -> 2 * i;
		Function<Integer, Integer> fun5 = i -> i * i * i;

		
		System.out.println(fun4.andThen(fun5).apply(3));
		System.out.println(fun5.andThen(fun4).apply(3));
		
		System.out.println(fun4.compose(fun5).apply(3));
		System.out.println(fun5.compose(fun4).apply(3));
		
		Function<String, String> idnetity = Function.identity();
		System.out.println(idnetity.apply("PANKAJ"));
	}
}
