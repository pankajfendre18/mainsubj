package com.test;

import java.io.IOException;

public class TestThrow1 {

	public static void main(String[] args) throws CustomException {
//		try {
//			throw new ArithmeticException("Checked Exception");

//			throw new IOException("Unchecked Exception");

			throw new CustomException("Custom Exception");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("Rest of Code");

	}

}
