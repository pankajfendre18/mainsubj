
public class Example1 {

	public static void main(String[] args) {
		// AAACCTDDAAZJJ --> A3C2TD2A2ZJ2

		String input = "AAACCTDDAAZJJ";
		String compressed = compressString(input);
		System.out.println(compressed);
	}

	public static String compressString(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}

		StringBuilder result = new StringBuilder();
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				result.append(str.charAt(i - 1));
				if (count > 1) {
					result.append(count);
				}
				count = 1;
			}
		}

		// Append last character and count
		result.append(str.charAt(str.length() - 1));
		if (count > 1) {
			result.append(count);
		}

		return result.toString();
	}
}
