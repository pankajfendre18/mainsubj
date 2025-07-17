package com.interview;

import java.util.HashMap;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length())
			return false;

		int[] mapS = new int[256];
		int[] mapT = new int[256];

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			if (mapS[c1] != mapT[c2])
				return false;

			// Store the index + 1 to avoid default 0 conflict
			mapS[c1] = i + 1;
			mapT[c2] = i + 1;
		}

		return true;
	}

	public static boolean isIsomorphicUsingMap(String s, String t) {
		if (s.length() != t.length())
			return false;

		HashMap<Character, Character> first = new HashMap<>();
		HashMap<Character, Character> second = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);

			// Forward mapping: s -> t
			if (first.containsKey(a)) {
				if (first.get(a) != b)
					return false;
			} else {
				first.put(a, b);
			}

			// Reverse mapping: t -> s
			if (second.containsKey(b)) {
				if (second.get(b) != a)
					return false;
			} else {
				second.put(b, a);
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isIsomorphicUsingMap("egg", "add"));
		System.out.println(isIsomorphicUsingMap("foo", "bar"));
//		System.out.println(isIsomorphic("paper", "title"));
//		System.out.println(isIsomorphic("ab", "aa"));
	}

}
