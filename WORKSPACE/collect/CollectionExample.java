package com.collect;

public class CollectionExample {
	public static void main(String[] args) {

		String s1 = "PANKAJ";
		int hashCode = s1.hashCode();
		System.out.println(hashCode);
		int a = hashCode ^ hashCode >>> 16;
		System.out.println(a);
		
		System.out.println(a & 15);

//		Object obj1 = new Object();
//		Object obj2 = new Object();
//
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
//
//		System.out.println(obj1 == obj2);
//		System.out.println(obj1.equals(obj2));
	}
}
