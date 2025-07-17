import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the no : ");
			int n = sc.nextInt();
			int a = 0, b = 1, i = 0, c;

			System.out.println(++i + "\t:\t" + a);
			System.out.println(++i + "\t:\t" + b);
			for (i = 3; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
				System.out.println(i + "\t:\t" + c);
			}
		}
	}
}
