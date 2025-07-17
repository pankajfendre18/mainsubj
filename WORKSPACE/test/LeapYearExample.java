package com.test;

import java.time.Year;

public class LeapYearExample {
	public static void main(String[] args) {
		int yearInt = 2020;
		if (((yearInt % 4 == 0) && (yearInt % 100 != 0)) || (yearInt % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR");
		}
		
		Year year = Year.of(yearInt);
		System.out.println(year.isLeap());
		
	}
}
