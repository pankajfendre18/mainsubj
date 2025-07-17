package com.collect;

import java.util.HashSet;

public class HashSetExample1 {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("RED");
		set.add("GREEN");
		set.add("BLUE");
		set.add("PINK");

		System.out.println(set);
		set.remove("RED");
		System.out.println(set);
	}
}
