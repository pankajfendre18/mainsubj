package com.aish;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Demo6 {

	public static void main(String[] args) {
		List<String> inputList = new ArrayList<>();

		inputList.add("Ram");
		inputList.add("Shyama");
		inputList.add("Radha");
		inputList.add("Chocolate");
		inputList.add("Pasta");
		List<String> filteredList = inputList.stream().filter(s -> s.length() % 3 == 0 || s.length() % 4 == 0).toList();

		StringJoiner joiner = new StringJoiner("-");

		for (int i = 0; i < filteredList.size(); i++) {
			joiner.add(filteredList.get(i));
		}

		System.out.println(joiner);

		System.out.println(inputList);

		List<String> reversed = inputList.reversed();

		System.out.println(reversed);

	}

}
