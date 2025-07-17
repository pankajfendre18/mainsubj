package com.aish;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo15 {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 2, 9, 1 };
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		int[] a = { 10, 15, 8, 49, 25, 98, 32 };

		Arrays.stream(a).mapToObj(String::valueOf).filter(s -> s.startsWith("1"))
				.forEach(n -> System.out.print(n + " "));

		List<Integer> list = List.of(10, 15, 8, 49, 25, 98, 32);
		list.stream().mapToInt(Integer::intValue).sum();

		String str = "This is Java interview, this java is a programming language. this";
		
		//Duplicate
//		Arrays.stream(str.toLowerCase().split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//		.entrySet().stream().filter(s -> s.getValue()>1).map(Map.Entry::getKey).forEach(st -> System.out.print(st +" "));
		
		//Max
		String string = Arrays.stream(str.toLowerCase().split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
		System.out.println(string);
		
		//sort in reverseorder acc to value
		
		String toSort = "MmKKKKbbbDDDDD";
		Arrays.stream(toSort.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).map(Map.Entry::getKey).forEach(n ->System.out.print(n));
		
		//sort acc to length
		
		Arrays.stream(str.toLowerCase().split(" ")).distinct().sorted(Comparator.comparingInt(String :: length)).forEach(System.out::println);
		
		
        int i = 123;
       int sum = String.valueOf(i).chars().map(Character :: getNumericValue).sum();
       System.out.println(sum);

		
		
		
		
		
	}

}
