package com.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrayExample {

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 5, 7 };
		int[] arr2 = { 12, 7, 5, 1 };
		Object[] merge = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).sorted().toArray();

		System.out.println(Arrays.toString(merge));

		int merglegnth = arr1.length + arr2.length;
		int megrdArr[] = new int[merglegnth];

		for (int i = 0; i < arr1.length; i++) {
			megrdArr[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			megrdArr[arr1.length + i] = arr2[i];
		}
		
		
		for (int i = 0; i < merglegnth - 1; i++) {
			for (int j = 0; j < merglegnth - i - 1; j++) {
				if (megrdArr[j] > megrdArr[j + 1]) {
					int temp = megrdArr[j];
					megrdArr[j] = megrdArr[j + 1];
					megrdArr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(megrdArr));

	}

}
