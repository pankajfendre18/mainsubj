
public class Example2 {

	static int i;

	public static void main(String[] args) {

		Example2.i = Example2.i + 10;

		Example2 obj1 = new Example2();

		obj1.i = obj1.i + 10;

		System.out.println(Example2.i);

		System.out.println(obj1.i);

	}

}
