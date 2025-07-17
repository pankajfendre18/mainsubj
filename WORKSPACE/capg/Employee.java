package com.capg;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;

	// Constructor
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// Getters
	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return name + " - " + department + " - ₹" + salary;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Employee> empList = Arrays.asList(new Employee(1, "Aishwarya", "IT", 15000),
				new Employee(2, "Priyanka", "Sales", 9000), new Employee(3, "Siddhi", "Sales", 20000),
				new Employee(4, "Pankaj", "IT", 25000)

		);

//		CompletableFuture<List<Employee>> future = CompletableFuture.supplyAsync(() -> {
//            if (empList == null || empList.isEmpty()) {
//                return Collections.emptyList();  // handle null/empty list safely
//            }
//
//            return empList.stream()
//                          .filter(e -> e.getSalary() > 10000)
//                          .collect(Collectors.toList());
//        });
		
		CompletableFuture<List<Employee>> future = CompletableFuture.supplyAsync(()->
		 Optional.ofNullable(empList).stream().flatMap(List::stream).filter(e -> e.getSalary()>10000).collect(Collectors.toList())
				);
				

        // Process result asynchronously
        future.thenAccept(filteredList -> {
            if (filteredList.isEmpty()) {
                System.out.println("No employees found with salary > 10,000.");
            } else {
                System.out.println("Employees with salary > 10,000:");
                filteredList.forEach(System.out::println);
            }
        });

        // Wait for the async operation to finish (important in console apps)
        future.join();

		// List<Employee> highestSalaryEmp = future1.get();
		// highestSalaryEmp.forEach(System.out::print);

		// find second highest salary
//		CompletableFuture<Double> future2 = CompletableFuture
//				.supplyAsync(() -> empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//						.skip(1).findFirst().get().getSalary());
//
//		Double secHigSal = future2.get();
//		System.out.println(secHigSal);
//
//		// count no of emp of each dept
//		CompletableFuture<Map<String, Long>> future3 = CompletableFuture.supplyAsync(
//				() -> empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
//		Map<String, Long> count = future3.get();
//
//		count.forEach((key, value) -> System.out.println("Department :: " + key + ", Count :: " + value));
//		
//		String str = "Java is a good programming. Java is a good language";
//		Map<String,Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);

	}
}
