package com.aish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DupEle {
	
	public static void main(String[] args) {
		Integer arr[]= new Integer[]{1,2,3,4,3,2,4,2};
		List<Integer> removeDup = Arrays.stream(arr).distinct().collect(Collectors.toList());
		System.out.println("removeDup : "+removeDup);
	}

}
