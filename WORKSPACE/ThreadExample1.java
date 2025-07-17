
public class ThreadExample1 extends Thread {

	public static void main(String[] args) {
		ThreadExample1 t1 = new ThreadExample1();
		t1.start();
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + " is running");
	}
}
