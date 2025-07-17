package com.interview;

public class ReverseString {
	public static void main(String[] args) {
		String str = "The quick brown fox";
		String[] strArr = str.split(" ");

		StringBuffer br = new StringBuffer();
		int n = strArr.length;
		for (int i = n - 1; i >= 0; i--) {
			br.append(strArr[i]).append(" ");
		}

		System.out.println(br.toString().trim());

	}
}
