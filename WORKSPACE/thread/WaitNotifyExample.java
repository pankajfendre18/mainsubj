package com.thread;

public class WaitNotifyExample {
	private static final Object lock = new Object();

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			synchronized (lock) {
				try {
					System.out.println("Thread1: Waiting for notification...");
					lock.wait(); // Thread1 waits here
					System.out.println("Thread1: Resumed after notification!");
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (lock) {
				System.out.println("Thread2: Sending notification...");
				lock.notify(); // Wakes up Thread1
			}
		});

		thread1.start();

		try {
			Thread.sleep(2000); // Ensure thread1 starts first
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		thread2.start();
	}
}
