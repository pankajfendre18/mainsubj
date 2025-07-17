package com.aish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MindgateExample {

	public static void main(String[] args) {

		List<String> listOfProgLangs = Arrays.asList("Java", "Python", "C++");

//		List<String> sortedList = Arrays.stream(listOfProgLangs.split("")).map(String::length).sorted().collect(Collectors.toList())

		List<String> collect = listOfProgLangs.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println(collect);

		String a1 = "India";
		String a2 = "Ind" + "ia";
		System.out.println(a2);
		System.out.println(a1 == a2);// at compile time constant folding -- true
		String a3 = "Ind";
		String a4 = a3 + "ia";
		System.out.println(a1 == a4);// at runtime time constant folding --true

		int x = 1;// 2
		int y = x++;// 1
		System.out.println(y++);
		System.out.println(++x);
		//System.out.println(y++ + ++x); // 4

	}

}
