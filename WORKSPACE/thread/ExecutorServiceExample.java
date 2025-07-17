package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		// Creating a thread pool with 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);
//		ExecutorService executor = Executors.newCachedThreadPool();
//		ExecutorService executor = Executors.newSingleThreadExecutor();

		for (int i = 1; i <= 5; i++) {
			final int taskID = i;
			executor.execute(() -> {
				System.out.println("Executing Task " + taskID + " by " + Thread.currentThread().getName());
			});
		}

		// Shutdown the executor
		executor.shutdown();
	}
}