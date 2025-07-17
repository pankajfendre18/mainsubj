package com.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Student1 {
	String name;
	int rollNo;
	String department;

	public Student1(String name, int rollNo, String department) {
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}

	@Override
	public int hashCode() {
		return rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student1 student = (Student1) obj;
		return (rollNo == student.rollNo);
	}

	
	
	@Override
	public String toString() {
		return rollNo + ", " + name + ", " + department;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(rollNo);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student1 other = (Student1) obj;
//		return rollNo == other.rollNo;
//	}
}

public class HashSetExample2 {
	public static void main(String[] args) {
		HashSet<Student1> set = new HashSet<Student1>();
		set.add(new Student1("Avinash", 121, "ECE"));
		set.add(new Student1("Bharat", 101, "EEE"));
		set.add(new Student1("Malini", 151, "Civil"));
		set.add(new Student1("Suresh", 200, "IT"));
		set.add(new Student1("Vikram", 550, "CS"));
		set.add(new Student1("Bharat", 301, "IT"));
		set.add(new Student1("Amit", 301, "IT")); // duplicate element
		set.add(new Student1("Bhavya", 872, "ECE"));
		set.add(new Student1("Naman", 301, "CS")); // duplicate element
		set.add(new Student1("Samson", 565, "Civil"));

		Iterator<Student1> it = set.iterator();
		while (it.hasNext()) {
			Student1 student = it.next();
			System.out.println(student);
		}
	}
}