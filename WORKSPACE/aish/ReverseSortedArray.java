package com.aish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 8, 1, 5 };

//		output = 8,5,3,2,1

		List<Integer> sorted = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(sorted);
	}

}
