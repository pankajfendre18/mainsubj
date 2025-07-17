package com.aish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo12 {

	public static void main(String[] args) {
		String str = "abbcccdddd";
		// 2nd high occ char c
		char key = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1).findFirst().get().getKey();
		System.out.println(key);

		Map<String, Long> collect = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		
		int arr[] = { 5, 6, 7, 0, 3, 4, 9 };
		int largest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1)
				.mapToInt(Integer::intValue).findFirst().getAsInt();
		// .orElseGet(null);
		// .skip(1).findFirst().getAsInt();
		System.out.println(largest);
		List<String> list = Arrays.asList("Java", "C#", "CPP", "Slang", "JavaScript");

		//

	}

}
