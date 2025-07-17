class ParentClass {

	ParentClass() {
		System.out.println("Parent: ");
	}

	
}

public class Main extends ParentClass {
	Main() {
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		Main obj = new Main();
	}
}