package com.aish;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo14 {

	public static void main(String[] args) {
		
		String input = "MmAaKKKbbbZZZZ";
		String collect = Arrays.stream(input.split(""))
        .collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ))
        .entrySet()
        .stream()
        .sorted(Comparator.comparing(Map.Entry<String,Long>::getValue,Comparator.reverseOrder()).thenComparing(Map.Entry::getKey))
        .map(e -> e.getValue()+ "" +  e.getKey()).collect(Collectors.joining());
		
		 String collect2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
        .sorted(Comparator.comparing(Map.Entry<String,Long>::getValue,Comparator.reverseOrder()).thenComparing(Map.Entry::getKey))
        .map(e -> e.getValue()+ "" +  e.getKey()).collect(Collectors.joining());
		 
		 System.out.println(collect);
		System.out.println(collect2);
		//.entryset().stream().sorted(Comparator.comparing(Map.Entry.comparingByValue(),))
		
	}

}
