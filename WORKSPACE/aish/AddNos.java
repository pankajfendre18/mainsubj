package com.aish;

public class AddNos {

	public static void main(String[] args) {
		int no = 132;
		int sum = 0;
		int prod = 1;
		
		while(no>0) {
			int temp = no%10;
			sum = sum + temp;
			prod = prod * temp;
			no = no/10;
		}
		System.out.println(sum);
		System.out.println(prod);
		if(sum == prod) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
