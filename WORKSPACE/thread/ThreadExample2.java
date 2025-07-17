package com.thread;

public class ThreadExample2 implements Runnable {

	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		new Thread(new ThreadExample2()).start();
	}

	@Override
	public void run() {
		System.out.println("Thread is running");
	}

}
