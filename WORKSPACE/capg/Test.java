package com.capg;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// find length of longest substring without repeating character in a string -
		// "pwwkeep" - output should be 3 i.e. wke

		String str = "pwwkeep";
		int left = 0, right = 0, maxlength = 0;
		HashSet<Character> set = new HashSet<>();

		if (!set.contains(str.charAt(right))) {
			set.add(str.charAt(right));
			maxlength = Math.max(maxlength, right - left + 1);
			right++;

		} else {
			set.remove(str.charAt(left));
			left++;
		}
		System.out.println(maxlength);

	}

}
