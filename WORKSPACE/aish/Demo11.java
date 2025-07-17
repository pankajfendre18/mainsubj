package com.aish;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo11 {

	public static void main(String[] args) {
		// Input: Hello World
		// Output: l:3 o:2

//		String str = "Hello World";
//		Map<String, Long> collect = Arrays.stream(str.split(""))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
//				.filter(i -> i.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//		System.out.println(collect);
//
//		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//				.entrySet().stream().filter(i -> i.getValue() > 1)
//				.forEach(System.out::println);

		String str = "test" + 10 + 20;
		System.out.println(str);

		System.out.println(0.3 == 0.1 * 3);
		System.out.println(0.2 == 0.1 * 2);
	}

}
