package com.capg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidByDepartment {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Alice", "HR", 50000),
				new Employee(2, "Bob", "IT", 80000), new Employee(3, "Charlie", "HR", 60000),
				new Employee(4, "David", "IT", 75000), new Employee(5, "Eve", "Finance", 90000),
				new Employee(6, "Frank", "Finance", 85000));

		Map<String, Optional<Employee>> highestPaid = employees.stream().collect(Collectors.groupingBy(
				Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

		// Print results
		highestPaid.forEach((dept, emp) -> System.out
				.println(dept + ": " + emp.get().getName() + " (₹" + emp.get().getSalary() + ")"));

		Map<String, Employee> highestPaidClean = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));

		System.out.println(highestPaidClean);

		List<Employee> salaryless = employees.stream().filter(e -> e.getSalary() < 85000).collect(Collectors.toList());

		System.out.println(salaryless);

		List<Employee> reverseOrderById = employees.stream().sorted((e1, e2) -> e2.getId() - e1.getId())
				.collect(Collectors.toList());

		System.out.println(reverseOrderById);

		List<Employee> reverseOrderById2 = employees.stream().sorted(Comparator.comparingInt(Employee::getId).reversed())
				.collect(Collectors.toList());

		System.out.println(reverseOrderById2);
	}
}
