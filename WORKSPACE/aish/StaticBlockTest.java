package com.aish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StaticBlockTest {

	public static void main(String[] args) {
		String str = "Java is programming language, Java is good language";
		String result = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(result);

		Map<String, Long> Count = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(Count);

		String m = "swiiss";
		Map<String, Long> charCount = Arrays.stream(m.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
		
		List<String> listOfProgLang = Arrays.asList("Java","C++","Python","C#");
		String collect = listOfProgLang.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.joining(" "));
		System.out.println(collect);
	}

}
