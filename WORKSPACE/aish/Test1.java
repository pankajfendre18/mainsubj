package com.aish;

public class Test1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int total = 10;
		int n = total * (total + 1) / 2;
		int sum = 0;

		for (int no : arr) {
			sum = sum + no;

		}

		int missingnumber = n - sum;
		System.out.println(missingnumber);

	}

}
