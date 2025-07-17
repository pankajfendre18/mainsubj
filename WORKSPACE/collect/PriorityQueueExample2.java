package com.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Employee {
	String name;

	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " : " + salary;
	}
}

class MyComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.salary - e2.salary;
	}
}

public class PriorityQueueExample2 {
	public static void main(String[] args) {

		PriorityQueue<Employee> pQueue = new PriorityQueue<Employee>(7, new MyComparator());

		pQueue.offer(new Employee("AAA", 15000));

		pQueue.offer(new Employee("BBB", 12000));

		pQueue.offer(new Employee("CCC", 7500));

		pQueue.offer(new Employee("DDD", 17500));

		pQueue.offer(new Employee("EEE", 21500));

		pQueue.offer(new Employee("FFF", 29000));

		pQueue.offer(new Employee("GGG", 14300));

		for (Iterator<Employee> iterator = pQueue.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());

		}

//		System.out.println(pQueue);

//		System.out.println(pQueue.poll()); // Output --> CCC : 7500
//
//		System.out.println(pQueue.poll()); // Output --> BBB : 12000
//
//		System.out.println(pQueue.poll()); // Output --> GGG : 14300
//
//		System.out.println(pQueue.poll()); // Output --> AAA : 15000
//
//		System.out.println(pQueue.poll()); // Output --> DDD : 17500
//
//		System.out.println(pQueue.poll()); // Output --> EEE : 21500
//
//		System.out.println(pQueue.poll()); // Output --> FFF : 29000
//		
//		System.out.println(pQueue);
	}
}