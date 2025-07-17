package com.aish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo8 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 1, 2, 4, 5, 3);

		

		int max2 = list.stream().max(Comparator.comparingInt(Integer::intValue)).get();
		int max3 = list.stream().mapToInt(Integer :: intValue).max().getAsInt();
		System.out.println(max3);

	}

}
