package com.java8.example;

import java.util.function.Supplier;

public class SupplierExample1 {

	public static void main(String[] args) {
		Supplier<Integer> sup1 = () -> 10;

		System.out.println(sup1.get());
	}

}
