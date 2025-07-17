
public class CharacterDigitRange {
	public static void main(String[] args) {
		String input = "abc123xyz248";

		char minChar = Character.MAX_VALUE, maxChar = Character.MIN_VALUE;
		char minDigit = '9', maxDigit = '0';

		for (char ch : input.toCharArray()) {
			if (Character.isLetter(ch)) {
				if (ch < minChar)
					minChar = ch;
				if (ch > maxChar)
					maxChar = ch;
			} else if (Character.isDigit(ch)) {
				if (ch < minDigit)
					minDigit = ch;
				if (ch > maxDigit)
					maxDigit = ch;
			}
		}

		System.out.println("Character Range: " + minChar + " - " + maxChar);
		System.out.println("Digit Range: " + minDigit + " - " + maxDigit);
	}
}