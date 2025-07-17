package com.collect;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	int id;

	String name;

	int percentage;

	public Student(int id, String name, int percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public int compareTo(Student s) {
		return this.id - s.id;
	}

}

class OrderByPercentage implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.percentage - s2.percentage;
	}
}

class OrderByName implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
