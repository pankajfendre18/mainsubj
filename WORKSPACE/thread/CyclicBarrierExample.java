package com.thread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

	public static void main(String[] args) {
		int threadCount = 3;
		CyclicBarrier barrier = new CyclicBarrier(threadCount, () -> {
			System.out.println("All threads reached the barrier. Proceeding...");
		});

		ExecutorService executor = Executors.newFixedThreadPool(threadCount);
		for (int i = 0; i < threadCount; i++) {
			executor.submit(() -> {
				try {
					System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
					barrier.await(); // Wait for other threads
					System.out.println(Thread.currentThread().getName() + " crossed the barrier");
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

		executor.shutdown();

	}

}
