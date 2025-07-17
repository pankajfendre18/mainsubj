package com.interview;

public class CharacterPositionAndLength {
	public static void main(String[] args) {

		String str = "AABBBCCCD";

		int n = str.length();
		if (n == 0) {
			System.out.println("No repeating characters found.");
			return;
		}

		int maxLen = 1, maxStart = 0;
		int currentLen = 1, currentStart = 0;

		for (int i = 1; i < n; i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				currentLen++; // Increase length of current repeating sequence
			} else {
				// Update max sequence if current is longer
				if (currentLen > maxLen) {
					maxLen = currentLen;
					maxStart = currentStart;
				}
				// Reset current sequence
				currentLen = 1;
				currentStart = i;
			}
		}

		// Final check after loop ends (last sequence)
		if (currentLen > maxLen) {
			maxLen = currentLen;
			maxStart = currentStart;
		}

		System.out.println(maxStart + "," + maxLen);

	}
}
