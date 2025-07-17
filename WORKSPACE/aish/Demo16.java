package com.aish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo16 {

	public static void main(String[] args) {
		String s1 = "React";
		String s2 = "Creat";
		String collect1 = Arrays.stream(s1.toLowerCase().split("")).sorted().collect(Collectors.joining(""));
		String collect2 = Arrays.stream(s2.toLowerCase().split("")).sorted().collect(Collectors.joining(""));
		if (collect1.equals(collect2)) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}

		List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 11, 15);
		List<Integer> primeNos = new ArrayList<>();

		for (Integer n : numbers) {
			if (isPrime(n)) {
				primeNos.add(n);
			}
		}

		System.out.println(primeNos);

	}

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
