package com.thread;

class Counter {
	int count = 0;

	public synchronized void increment() {
		count++; // Not thread-safe
	}

}

public class SynchronizationExample1 {

	public static void main(String[] args) throws Exception {
		Counter counter = new Counter();

		Thread t1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " :: STARTS");
			for (int i = 0; i < 1000; i++)
				counter.increment();
			System.out.println(Thread.currentThread().getName() + " :: ENDS");
		});

		Thread t2 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " :: STARTS");
			for (int i = 0; i < 1000; i++)
				counter.increment();
			System.out.println(Thread.currentThread().getName() + " :: ENDS");
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Count: " + counter.count); // Expected: 2000, but may be less!

	}

}
