package com.java8.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Practice1 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 5, 6, 3, 7);
		List<Integer> list2 = Arrays.asList(6, 9, 8, 5, 2, 4);
		List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(collect);

		// Stream.concat(list1.stream(), list2.stream()).distinct().sorted().forEach(n
		// -> System.out.print(n + " "));

		int max = list1.stream().max(Integer::compare).get();
		System.out.println(max);

		List<String> list3 = Arrays.asList("CPP", "1Java", "5JavaScript");
		List<String> collect2 = list3.stream().sorted(Comparator.comparing(String::length).reversed())
				.collect(Collectors.toList());
		System.out.println(collect2);

		List<StringBuilder> collect3 = list3.stream().map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.toList());
		System.out.println(collect3);

		list3.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(n -> System.out.print(n + " "));

		List<Integer> list4 = Arrays.asList(1, 2, 1, 5, 6, 5, 3, 7, 3);
		Set<Integer> unique = new HashSet<>();
		List<Integer> duplicateList = list4.stream().filter(i -> !unique.add(i)).collect(Collectors.toList());
		System.out.println(duplicateList);

		int i = 15623;

		Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

		System.out.println(sumOfDigits);

	}

}
