package com.collect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("J2EE");
		listWithDuplicateElements.add("JSP");
		listWithDuplicateElements.add("SERVLETS");
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("STRUTS");
		listWithDuplicateElements.add("JSP");

		System.out.print("ArrayList With Duplicate Elements :");
		System.out.println(listWithDuplicateElements);

		ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(new HashSet<String>(listWithDuplicateElements));

		System.out.print("ArrayList After Removing Duplicate Elements :");
		System.out.println(listWithoutDuplicateElements);

		ArrayList<String> listWithoutDuplicateElements1 = new ArrayList<String>(new LinkedHashSet<String>(listWithDuplicateElements));

		System.out.print("ArrayList After Removing Duplicate Elements :");
		System.out.println(listWithoutDuplicateElements1);

	}
}
