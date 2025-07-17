package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamExample3 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("APPLE", "BANANA", "CHERRY");

		Stream<String> myStream1 = list.stream();

		String arr[] = { "PANKAJ", "KUNAL", "DEEPAK" };

		Stream<String> myStream2 = Arrays.stream(arr);

		Stream<Integer> myStream3 = Stream.of(1, 2, 3, 4, 5);

		Stream<Integer> myStream4 = Stream.iterate(0, n -> n + 1).limit(100);

		Stream<Integer> myStream5 = Stream.generate(() -> new Random().nextInt()).limit(10);
	}

}
