package com.test;

public class TestFinallyBlock1 {
	public static void main(String args[]) {

		try {

			System.out.println("Inside the try block");
			System.exit(0);
			int data = 25 / 0;
			
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of the code...");
	}
}