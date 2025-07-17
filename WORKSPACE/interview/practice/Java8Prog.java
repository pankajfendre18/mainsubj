package com.interview.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Prog {

	public static void main(String[] args) {

		// Remove duplicates
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		List<String> unique = listOfStrings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(unique);

		// Char frequency
		String inputString = "Java Concept Of The Day";
		Map<Character, Long> map = inputString.replaceAll(" ", "").chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

		// String freq
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");
		Map<String, Long> freqMap = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freqMap);

		// Sort in reverse order
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		List<Double> sortedList = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList);

		// Multiples of 5
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		List<Integer> collect = listOfIntegers.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
		System.out.println(collect);

		// Max and Min
		List<Integer> listOfInt = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		int max = listOfInt.stream().max(Comparator.comparingInt(Integer::intValue)).get();
		System.out.println(max);
		
		//merge two unsorted arrays and sort
		int[] a = new int[] {4, 2, 7, 1};
        
        int[] b = new int[] {8, 3, 9, 5};

        int c[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(c));
        
        //3 max and 3 min nos 
        List<Integer> findMaxandMin = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        findMaxandMin.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        
        //check anagram
        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1 = Arrays.stream(s1.split("")).map(word -> word.toLowerCase()).sorted().collect(Collectors.joining(""));
        s2 = Arrays.stream(s2.split("")).map(word -> word.toLowerCase()).sorted().collect(Collectors.joining(""));
        if(s1.equals(s2)) {
        	System.out.println("Anagram");
        }else {
        	System.out.println("Not Anagram   :  "+ s1 + "   " +s2);

        }
        
        //sum
        int i = 123;
        int sum = IntStream.of(i).sum();
        System.out.println(sum);
        
        //sort by length
        List<String> sortByLength = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> collect2 = sortByLength.stream().sorted(Comparator.comparingInt(String::length).reversed()).filter(rev-> rev.toLowerCase().contains("t")).limit(3).collect(Collectors.toList());
        System.out.println(collect2);
        
        //find sum and avg
        int[] arr = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum1 = Arrays.stream(arr).sum();
        System.out.println(sum1);
        
        //find common ele
        
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        
       List<Integer> distArray= Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        System.out.println(distArray);
        
	}
}