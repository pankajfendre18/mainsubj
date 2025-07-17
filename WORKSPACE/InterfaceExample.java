interface A {
	default void display() {
		System.out.println("A");
	}
}

interface B {
	default void display() {
		System.out.println("B");
	}
}

class Parent {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
//		A object = new InterfaceExample();
//		object.display();
		Parent p = new Parent();

		p.setI(10);
		System.out.println(p.getI());

	}

//	@Override
//	public void display() {
//		B.super.display();
//	}

}
