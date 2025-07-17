package com.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {

	private String name;
	private String collegeName;
	private int rollNo;
	private boolean isSelected;

	public Student(String name, String collegeName, int rollNo, boolean isSelected) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.rollNo = rollNo;
		this.isSelected = isSelected;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

}

class Employee {
	private String name;
	private String companyName;
	private int empId;

	public Employee(String name, String companyName, int empId) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", companyName=" + companyName + ", empId=" + empId + "]";
	}

}

public class Test {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("A", "a", 1, false));
		studentList.add(new Student("B", "a", 1, true));
		studentList.add(new Student("C", "a", 1, false));
		studentList.add(new Student("D", "a", 1, true));

		Stream<Employee> peek = studentList.stream().filter(s -> s.isSelected())
				.map(s -> new Employee(s.getName(), s.getCollegeName(), s.getRollNo())).collect(Collectors.toList())
				.stream().peek(e-> System.out.println(e.getName()));
		
		
		
//		System.out.println(peek);

//		List<Employee> employeeList = new ArrayList<>();
//		
//		for (Student student : selectedList) {
//			
//		}
	}

}
