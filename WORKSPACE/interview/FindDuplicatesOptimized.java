package com.interview;

public class FindDuplicatesOptimized {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 3, 3, 2, 1 };
		System.out.print("Duplicates: ");
		for (int i = 0; i < arr.length; i++) {
			int index = Math.abs(arr[i]) - 1;
			if (arr[index] < 0) {
				System.out.print(Math.abs(arr[i]) + " ");
			} else {
				arr[index] = -arr[index]; // Mark as visited
			}
		}
	}
}
