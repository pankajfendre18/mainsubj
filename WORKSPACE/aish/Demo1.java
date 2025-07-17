package com.aish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.capg.Employee;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 3, 3, 2, 1 };
		Set<Integer> uniques = new HashSet<>();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					duplicates.add(arr[i]);
//				}
//
//			}
//		}
//
//		System.out.println(duplicates);

		Set<Integer> collect = Arrays.stream(arr).boxed().filter(i -> !uniques.add(i)).collect(Collectors.toSet());

		List<Integer> collect2 = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(collect2);

		System.out.println(collect);

		System.out.println(uniques);

		List<Employee> empList = Arrays.asList(new Employee(1, "Aishwarya", "IT", 15000.00),
				new Employee(2, "Pankaj", "CS", 17000), new Employee(3, "Sayli", "IT", 25000),
				new Employee(4, "Snehal", "Sales", 19000));

		List<Double> collect3 = empList.stream().filter(e -> e.getSalary() < 20000).map(e -> e.getSalary() + 2000)
				.collect(Collectors.toList());
		System.out.println(collect3);

		List<Employee> collect4 = empList.stream().filter(e -> e.getDepartment().equals("IT") && e.getSalary() < 20000)
				.collect(Collectors.toList());
		System.out.println(collect4);
	}

}
