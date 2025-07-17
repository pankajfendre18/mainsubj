package com.array;

import java.util.Arrays;

public class MergeArrayExample1 {

	public static void main(String[] args) {
		int[] a = { 10, 2, 5, 7 };
		int[] b = { 12, 7, 5, 1 };

		int length = a.length + b.length;
		int[] c = new int[length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(c));
	}

}
