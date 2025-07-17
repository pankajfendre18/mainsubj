
public class StaticBlockExample {
	static {
		System.out.println("Hello");

	}

	public static void main(String[] args) {

		Runnable r = () -> {
			System.out.println("ShutDownHook");
		};
		Runtime.getRuntime().addShutdownHook(new Thread(r));
		System.exit(0);
	}
}
