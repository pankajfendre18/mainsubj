package com.thread;

public class InterruptHandling {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			try {
				System.out.println("Thread will sleep for 5 seconds.");
				Thread.sleep(5000);
				System.out.println("Thread woke up after sleep.");
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Thread was interrupted during sleep.");
			}
		});
		t1.start();

		try {
			Thread.sleep(2000);
			t1.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
