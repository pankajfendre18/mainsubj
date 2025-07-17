package com.test;

public class OperatorExample {
	public static void main(String args[]) {
//		int a = 10;
//		int b = -10;
//		boolean c = true;
//		boolean d = false;
//		System.out.println(~a);// -11 (minus of total positive value which starts from 0)
//		System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
//		System.out.println(!c);// false (opposite of boolean value)
//		System.out.println(!d);// true
		
		short a=10;  
		short b=10;  
		//a+=b;//a=a+b internally so fine  
		a=(short) (a+b);//Compile time error because 10+10=20 now int  
		System.out.println(a); 
	}
}
