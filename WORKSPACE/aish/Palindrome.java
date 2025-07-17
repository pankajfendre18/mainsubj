package com.aish;

public class Palindrome {

	public static void main(String[] args) {
		
		int no =153;
		int num = no;
		int rev = 0;
		int sum = 0;
		while(no>0) {
			int temp = no % 10;
			sum = sum + temp*temp*temp;
			no = no/10;
		}
		System.out.println(sum);
		if(sum==num) {
		System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
