package com.java8.example;

@FunctionalInterface
interface Add {
	int add(int a, int b);
}

public class FunctionalInterfaceExample1 {
	public static void main(String[] args) {

		Add add = new Add() {

			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};

		Add add1 = (a, b) -> a + b;

		System.out.println(add1.add(10, 20));

	}
}
