package com.test;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;


public class Simple {

	public static void main(String[] args) {
//		System.out.println("Hello World");
		Vector<String> v = new Vector<>();
		v.add("PANKAJ");
		v.add("AISHWARYA");
		
		List<String> list = Arrays.asList("PANKAJ","AISHWARYA");
		
//		Enumeration<String> enu = v.elements();
//		Iterator<String> itr = enu.asIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			itr.remove();
//		}

		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
//			itr.add("TEJAL");
			System.out.println(itr.next());
//			itr.remove();
		}
		
	}
}
