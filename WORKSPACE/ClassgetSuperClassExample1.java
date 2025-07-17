
class SuperClass {

}

public class ClassgetSuperClassExample1 extends SuperClass {

	public static void main(String args[]) {
		ClassgetSuperClassExample1 objsub = new ClassgetSuperClassExample1();
		Class<?> class1;
		class1 = objsub.getClass();
		System.out.println("objsup1 is object of type = " + class1.getName());
		class1 = class1.getSuperclass();
		System.out.println("super class of objsup1 = " + class1.getName());
	}
}
