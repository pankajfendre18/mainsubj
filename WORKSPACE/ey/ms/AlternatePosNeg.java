package com.ey.ms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlternatePosNeg {
	public static void main(String[] args) {
		int[] arr = { 3, -2, 5, -7, 8, -4, -6, 9, 1, -1 }; // Sample input

		// Separate positive and negative numbers using Java 8 Streams
		List<Integer> positives = Arrays.stream(arr).filter(n -> n > 0).boxed().collect(Collectors.toList());

		List<Integer> negatives = Arrays.stream(arr).filter(n -> n < 0).boxed().collect(Collectors.toList());

		// Print alternately
		int i = 0, j = 0;
		while (i < positives.size() || j < negatives.size()) {
			if (i < positives.size())
				System.out.print(positives.get(i++) + " ");
			if (j < negatives.size())
				System.out.print(negatives.get(j++) + " ");
		}
	}
}
