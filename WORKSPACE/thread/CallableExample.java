package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Callable<Integer> task = () -> {
			Thread.sleep(1000);
			return 42;
		};

		Future<Integer> future = executor.submit(task);
		System.out.println("Result: " + future.get()); // Blocks until result is available

		executor.shutdown();
	}
}
