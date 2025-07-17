package com.java8.example;

import java.util.Arrays;

public class StreamExample1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum1 = sum1 + arr[i];
			}
		}

		System.out.println(sum1);

		int sum2 = Arrays.stream(arr).filter(x -> x % 2 == 0).sum();
		
		System.out.println(sum2);
	}

}
