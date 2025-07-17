package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		String str = "12321";

//		System.out.println(new StringBuilder(str).reverse());

		char[] strArr = str.toCharArray();
		char[] strReverseArr = new char[strArr.length];

		for (int i = strArr.length - 1, j = 0; i >= 0; i--, j++) {

			strReverseArr[j] = strArr[i];
		}

		String strRev = new String(strReverseArr);
//		if (str.equalsIgnoreCase(strRev)) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("Not Palindrome");
//		}

		String str1 = "PANKAJ";
		String str2 = "PANKA";
		String str3 = "a";

//		System.out.println(str1 + " " + str1.codePointAt(0));
//
//		System.out.println(str2 + " " + str2.codePointAt(0));
//
//		System.out.println(str3 + " " + str3.codePointAt(0));

//		System.out.println(str1.compareTo(str2));
//
//		System.out.println(str1.compareToIgnoreCase(str2));

		List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); 
		String string = liststr.stream().collect(Collectors.joining(", "));
		System.out.println(string); 
	}

}
