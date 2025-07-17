package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 9, 6, 5, 3, 4, 7, 4, 3, 4, 5);

		List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		List<Integer> divideList = evenList.stream().map(x -> x / 2).collect(Collectors.toList());
		System.out.println(divideList);

		List<Integer> finalList = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct()
				.sorted((a, b) -> (b - a)).collect(Collectors.toList());
		System.out.println(finalList);

		System.out.println(Stream.iterate(1, n -> n + 1).limit(100)
				.filter(x -> x % 2 == 0)
				.map(x -> x / 10)
				.distinct()
				.sorted((a, b) -> (b - a))
				.collect(Collectors.toList()));

	}

}
