import java.util.Arrays;

public class RemoveSpecialCharacterExample {
	public static void main(String[] args) {
		String str = "@#$@%$WJGJ322AFAFAFS%T^";

		String str1 = str.replaceAll("[^A-Za-z0-9]", "");

		System.out.println(str1);
		
		char[] arr = str.toCharArray();

		char[] arr1 = new char[arr.length];

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLetterOrDigit(arr[i])) {
				arr1[j] = arr[i];
				j++;
			}
		}

		String str2 = new String(arr1);
		System.out.println(str2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));

	}
}
