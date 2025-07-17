
public class ExceptionExample1 {

	public static void main(String[] args) {

		System.out.println(returnSomething());
	}

	public static String returnSomething() {
		try {
			//System.out.println("try");
			//throw new Exception();
			return "A";
		} 
		catch (Exception e) {
			System.out.println("catch");
			return "B";
		} 
		finally {
			System.out.println("finally");
			return "C";
		}
	}
}
