package com.interview;

public class ReverseWordStringExample {

	public static void main(String[] args) {
		String str = "My Name Is Akash";
		StringBuilder sb = new StringBuilder();
		String[] strArr = str.split(" ");

		for (String string : strArr) {
			sb = sb.append(new StringBuilder(string).reverse()).append(" ");
		}

		System.out.println(sb.toString().trim());

	}

}
