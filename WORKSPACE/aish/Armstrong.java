package com.aish;

public class Armstrong {

	public static void main(String[] args) {
		int no = 153;
		int sum = 0;

		while(no>0){
		int temp = no % 10;
		sum = sum + temp * temp * temp;
		no = no/10;
		}
		if(sum == no)
		System.out.println(sum);
	}

}
