package com.thread;

public class ThreadJoinExample extends Thread {
	public static void main(String argvs[]) {

		ThreadJoinExample th1 = new ThreadJoinExample();
		ThreadJoinExample th2 = new ThreadJoinExample();
		ThreadJoinExample th3 = new ThreadJoinExample();
		th1.start();
		try {
			th1.join(900);
		} catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}
		th2.start();
		th3.start();
	}

	public void run() {

		for (int j = 1; j <= 5; j++) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				System.out.println("The exception has been caught: " + e);
			}
			System.out.println(j + " : " + Thread.currentThread().getName());
		}

	}
}
