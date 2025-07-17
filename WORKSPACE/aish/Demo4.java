package com.aish;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		int arr[] = {2,11,15,7};
		int target = 9; //output [0,1]
		List list = new ArrayList();
		for(int i=0; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					list.add(i);
					list.add(j);
				}
			}
		}
		System.out.println(list);

	}

}
