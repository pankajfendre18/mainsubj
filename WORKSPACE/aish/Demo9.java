package com.aish;

import java.util.Arrays;
import java.util.Comparator;

public class Demo9 {

	public static void main(String[] args) {
		//2nd largest
		int arr[] = {5,3,8,4,1};
		int largest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Largest : "+largest);
		
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
		int first = 0;
		int second = 0;
		for(int num : arr) {
			if(num > first) {
				second = first;
				first = num;
			}else if(num > second) {
				second = num;
			}
		}
		System.out.println("First : "+first);
		System.out.println("Second : "+second);
		
	}

}
