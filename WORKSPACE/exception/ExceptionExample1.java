package com.exception;

public class ExceptionExample1 {
	public static void main(String[] args) {
		try {
			throw new EmpolyeeNotFoundException("Message");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
