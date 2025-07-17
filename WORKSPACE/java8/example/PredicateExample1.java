package com.java8.example;

import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {

		Predicate<Integer> pred1 = (i) -> i > 100;

		Predicate<Integer> pred2 = (i) -> i < 200;

		Predicate<Integer> pred3 = pred1.and(pred2);

		Predicate<Integer> pred4 = pred1.or(pred2);

		Predicate<Integer> pred5 = Predicate.not(pred1);

		Predicate<Integer> pred6 = pred1.negate();

		System.out.println(pred6.test(100));

		System.out.println(pred5.test(100));

		System.out.println(pred3.test(100));

		System.out.println(pred4.test(-100));

	}
}
