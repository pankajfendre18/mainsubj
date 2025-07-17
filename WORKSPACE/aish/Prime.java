package com.aish;

public class Prime {

	public static void main(String[] args) {
		int num = 17;
		boolean isPrime = true;
		
		if(num<=1) {
			isPrime = false;
		}else {
			for(int i = 2; i * i<=num;i++) {
				if(num%i==0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("No is Prime");
		}else {
			System.out.println("Not prime");
		}
	}

}
