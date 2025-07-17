package com.aish;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 5, 6);
		List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 8, 9);
		Set<Integer> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(list2);

		System.out.println("Unique :: " + set);

		List<Integer> resultList = Stream.concat(list1.stream(), list2.stream()).distinct()
				.collect(Collectors.toList());

		System.out.println(resultList);
	}

}
