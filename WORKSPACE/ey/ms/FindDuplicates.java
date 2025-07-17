package com.ey.ms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void findDuplicates(int[] arr) {
		// Convert the array to a list for easier manipulation
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		// Use groupingBy to find duplicates
		Map<Integer, Long> frequencyMap = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		// Filter and print numbers that appear more than once (duplicates)
		frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println("Duplicate number: " + entry.getKey()));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 3, 5, 1, 6, 9 };
		findDuplicates(arr);
	}
}