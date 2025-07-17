package com.test;

import java.util.RandomAccess;

public class CloneExample1 implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneExample1 c1 = new CloneExample1();
		System.out.println(c1.hashCode());
		CloneExample1 c2 = (CloneExample1) c1.clone();
		System.out.println(c2.hashCode());
	}
}
