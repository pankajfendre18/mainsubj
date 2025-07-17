
public class Example3 {
	int instance;
	static int staticVariable;

	public static void main(String[] args) {
		Example3 obj = new Example3();
		System.out.println("1 : " + obj.instance);
		System.out.println("2 : " + staticVariable);
		obj.display();

	}

	public void display() {
		int local = 0;

		System.out.println("3 : " + local);
		System.out.println("4 : " + instance);
	}
}
