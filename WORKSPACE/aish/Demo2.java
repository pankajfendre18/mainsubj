package com.aish;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		String str = "communication";

		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<Character, Long> collect2 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);
		System.out.println(collect2);
	}

}
