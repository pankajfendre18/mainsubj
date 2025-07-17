package com.test;

import java.util.HashMap;

public class PrintOccurenceOfEachElement {

	public static void main(String[] args) {
		int[] a = { 10, 11, 12, 10, 15, 16, 11 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		System.out.println(map);

	}

}
