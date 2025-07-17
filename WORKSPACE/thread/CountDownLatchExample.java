package com.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CountDownLatchExample {

	public static void main(String[] args) throws Exception {
		int threadCount = 10;
		CountDownLatch latch = new CountDownLatch(threadCount);

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < threadCount; i++) {
			Future<String> result = executor.submit(() -> {
				Thread thread = Thread.currentThread();
				System.out.println(thread.getName() + " completed its task");
				latch.countDown(); // Decrease the latch count
				return thread.getName() + " : " + thread.getPriority();
			});

//			System.out.println("Result :: " + result.get());
		}

		latch.await(); // Wait until the count reaches zero
		System.out.println("All tasks are completed. Proceeding...");
		executor.shutdown();

	}

}
