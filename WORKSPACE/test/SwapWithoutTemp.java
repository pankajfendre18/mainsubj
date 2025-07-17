package com.test;

public class SwapWithoutTemp {
	public static void main(String args[]) {
		String a = "Love";//4
		String b = "You";//3
		System.out.println("Before swap: " + a + " " + b);
		a = a + b; //4+3=7 // LoveYou
		b = a.substring(0, a.length() - b.length());//(0,4) //4
		a = a.substring(b.length());// (4)//3
		System.out.println("After : " + a + " " + b);
		
		String str = null;
		System.out.println(str.length());
		
	}
}
