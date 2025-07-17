package com.aish;

public class ThreadExample {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> new ThreadExample().print("ONE"));
		Thread t2 = new Thread(() -> new ThreadExample().print("TWO"));
		Thread t3 = new Thread(() -> new ThreadExample().print("THREE"));

		t1.start();
		t2.start();
		t3.start();

	}

	public synchronized void print(String thread) {
		System.out.println(thread);
	}
}
