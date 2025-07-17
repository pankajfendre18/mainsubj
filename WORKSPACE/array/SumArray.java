package com.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumArray {

	public static void main(String[] args) {
		int arr[] = {2,2,5,1,1,1,4,4};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum +arr[i];
		}
		
		System.out.println(sum);
		
		int unique = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue()==1).map(Map.Entry::getKey).findFirst().get();
		System.out.println(unique);
		
		//max repeating
		int maxRepeating = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
		System.out.println(maxRepeating);
		
		//2nd largest
		int secondLargest = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargest);
	}

}
