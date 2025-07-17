
public class IntegerExample {
	public static void main(String[] args) {
		int x = 10;
		String y = String.valueOf(x);
		System.out.println(y);

		String a = "10";

		int b = Integer.valueOf(a);
		int c = Integer.parseInt(a);
		System.out.println(b + " " + c);
	}
}
