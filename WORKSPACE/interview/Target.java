package com.interview;

public class Target {

	public static void main(String[] args) {

		int arr[] = { 0, -1, 2, -3, 1 };
		int target = -2;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {
					System.out.println("true");
				}

			}
		}

	}

}
