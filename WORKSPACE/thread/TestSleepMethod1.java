package com.thread;

public class TestSleepMethod1 extends Thread {

	public static void main(String[] args) {

		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();

		t1.start();
		t2.start();
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
