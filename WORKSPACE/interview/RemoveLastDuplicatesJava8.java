package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveLastDuplicatesJava8 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
		List<String> result = removeLastDuplicates(list);
		System.out.println(result); // Output: [apple, banana, orange, grape]
	}

	public static List<String> removeLastDuplicates(List<String> list) {
		Set<String> seen = new LinkedHashSet<>();
		// Traverse in reverse, then reverse again to preserve order
		List<String> reversed = new ArrayList<>(list);
		Collections.reverse(reversed);

		List<String> list1 = list.stream().filter(seen::add) // add returns false if already exists
				.collect(Collectors.toList());

//		Collections.reverse(filteredReversed); // restore original order
		return list1;
	}
}
