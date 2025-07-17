package com.aish;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdjacentSumExample {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8 };

		List<Integer> collect = IntStream.range(0, arr.length-1).map(x -> arr[x] + arr[x + 1]).boxed()
				.collect(Collectors.toList());
		System.out.println(collect);
		
		IntStream.range(1, 11).forEach(System.out::println);
	}

}
