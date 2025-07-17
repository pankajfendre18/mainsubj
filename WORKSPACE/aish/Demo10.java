package com.aish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo10 {
	public static void main(String[] args) {
		String str = "I am Aishwarya Karpe. I am from Mumbai";

		String entry = Arrays.stream(str.replaceAll("\\s+", "").toLowerCase().split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(2).findFirst().get().getKey();

		System.out.println(entry);
	}
}
