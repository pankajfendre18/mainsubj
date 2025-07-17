package com.aish;

import java.util.Stack;

public class TestJava8 {

	public static void main(String[] args) {
		int arr[] = {1,0,1,1,0,1,0,0};
		
		Stack<Integer> zero = new Stack<Integer>();
		Stack<Integer> ones = new Stack<Integer>();
		
		for(int num : arr) {
			if(num==0) {
				zero.push(num);
			}else if(num ==1) {
				ones.push(num);
			}
		}
		while(!zero.isEmpty() ) {
		System.out.print(zero.pop() + " ");
		}
		while(!ones.isEmpty() ) {
		System.out.print(ones.pop() + " ");
		}

	}

}
