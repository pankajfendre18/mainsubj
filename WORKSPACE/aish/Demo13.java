package com.aish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo13 {

	public static void main(String[] args) {
		String str1 = 10 * 20 + "check";
		String str2 = "check" + 10 * 20;

		System.out.println(str1);
		System.out.println(str2);

		String s = "This is HCL interview and in this interview I am using laptop.";
		// Count duplicate
		Map<String, Long> collect = Arrays.stream(s.toLowerCase().split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(str -> str.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(collect);

		Arrays.stream(s.toLowerCase().split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(str -> str.getValue() > 1).forEach(System.out::println);

		List<Integer> list = List.of(2, 3, 5, 6, 11, 67, 32, 9);

		// Multiply the even number by 2 and add odd number by 1

		List<Integer> even = list.stream().filter(i -> i % 2 == 0).map(i -> i * 2).collect(Collectors.toList());
		List<Integer> odd = list.stream().filter(i -> i % 2 != 0).map(i -> i + 1).collect(Collectors.toList());
		List<Integer> collect2 = Stream.concat(even.stream(), odd.stream()).collect(Collectors.toList());
		System.out.println(collect2);

		List<Integer> list2 = list.stream().map(n -> n % 2 == 0 ? n * 2 : n + 1).toList();

		System.out.println(list2);

	}

}
