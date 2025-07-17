
public class StringExample1 {
	public static void main(String[] args) {
		String s1 = "Welcome";

		System.out.println(s1.hashCode() + " : " + s1);
//		s1 = "Welcome JAVA";
//
//		System.out.println(s1.hashCode() + " : " + s1);

		String s2 = "WELCOME";

		System.out.println(s2.hashCode() + " : " + s2);

		System.out.println(s1 == s2);
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
