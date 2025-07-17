package com.aish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Apple", "Banana", "Cherry", "Fig", "Elderberry", "Mango", "Orange",
				"Kiwi", "Strawberry");

		strings.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(5).
		filter(i -> i.toLowerCase().contains("a")).forEach(System.out::println);
				//.filter(i -> i.toLowerCase().contains("a")).forEach(System.out::println);

//		int arr[] = { 1, 3, 2 };
//		int a = arr[0];
//		int b = arr[1];
//		int c = arr[2];
//
//		if (a + b + c == a * b * c) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}

	}

}
