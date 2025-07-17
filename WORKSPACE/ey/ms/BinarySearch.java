package com.ey.ms;

public class BinarySearch {
	// Iterative Binary Search
	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2; // Avoids integer overflow

			if (arr[mid] == key)
				return mid; // Element found

			if (arr[mid] < key)
				left = mid + 1; // Search right half
			else
				right = mid - 1; // Search left half
		}
		return -1; // Element not found
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 }; // Sorted array
		int key = 40;

		int result = binarySearch(arr, key);
		if (result != -1)
			System.out.println("Element found at index: " + result);
		else
			System.out.println("Element not found");
	}
}
