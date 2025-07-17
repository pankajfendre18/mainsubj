
public class TestExmple181 {

	static int a = 20;
	static int b = 30;
	static int c = 40;
	
	{
		System.out.println("Instance");
	}
	TestExmple181() {
		a = 200;
	}
	public void test() {
		a=500;
	}
	static void m1() {
		b = 300;
	}

	static {
		c = 400;
	}

	public static void main(String[] args) {
		new TestExmple181().test();
		m1();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
