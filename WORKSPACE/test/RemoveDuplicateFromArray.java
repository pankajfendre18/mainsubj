package com.test;

import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] a = { 10, 11, 12, 10, 15, 16, 11 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			if (!set.contains(a[i])) {
				set.add(a[i]);
			}
		}

		System.out.println(set);
	}

}
