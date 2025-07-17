package com.aish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo17 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2, 4, 6, 8);
		List<Integer> list2 = Arrays.asList(7, 5, 3, 9, 2);

		List<Integer> list = Stream.concat(list1.stream(), list2.stream())
				.filter(e -> !(list1.contains(e) && list2.contains(e))).sorted(Comparator.reverseOrder()).toList();
		
		Stream.concat(list1.stream().filter(e -> !list2.contains(e)), list2.stream()
				.filter(e->!list1.contains(e))).sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println(list);
	}

}
