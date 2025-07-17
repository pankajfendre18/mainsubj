public class OverrideExample1 {

	public static void main(String[] args) {

		m1(Integer.valueOf(10));
	}

	public static void m1(int i) {
		System.out.println("Primitive");
	}
	
	public static void m1(long i) {
		System.out.println("Long");
	}

	public static void m1(Integer i) {
		System.out.println("Wrapper");
	}
}
