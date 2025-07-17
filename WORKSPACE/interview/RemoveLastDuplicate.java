package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class RemoveLastDuplicate {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape"));
		removeLastDuplicates(list);
		System.out.println(list); // Output: [apple, banana, orange, grape]
		
	}

	public static void removeLastDuplicates(List<String> list) {
		Set<String> seen = new HashSet<>();
		ListIterator<String> iterator = list.listIterator(list.size());

		while (iterator.hasPrevious()) {
			String current = iterator.previous();
			if (seen.contains(current)) {
				iterator.remove(); // remove the last occurrence
			} else {
				seen.add(current);
			}
		}

//		Collections.reverse(list);
	}
}
