package com.thread;

public class TestInterruptingThread4 extends Thread {

	public void run() {
		for (int i = 1; i <= 2; i++) {
			if (Thread.interrupted()) {
				System.out.println(Thread.currentThread().getName() + " code for interrupted thread " + i);
			} else {
				System.out.println(Thread.currentThread().getName() + " code for normal thread " + i);
			}

		} // end of for loop
	}

	public static void main(String args[]) {

		TestInterruptingThread4 t1 = new TestInterruptingThread4();
		TestInterruptingThread4 t2 = new TestInterruptingThread4();

		t1.start();
		t1.interrupt();

		t2.start();

	}
}