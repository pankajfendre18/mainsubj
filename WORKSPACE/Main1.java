class Test1 {
	int age;
}

public class Main1 {

	public void method1() {
		Test1 a = new Test1();
		a.age = 10;
		method2(a);
		System.out.println("a.age is " + a.age);
	}

	public void method2(Test1 b) {
		b.age = 20;

	}

	public static void main(String[] args) {

		Main1 main1 = new Main1();
		main1.method1();

	}
}
