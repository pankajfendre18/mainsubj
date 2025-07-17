package com.thread;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MapPerformanceTest {
	public static void main(String[] args) throws InterruptedException {
		Map<Integer, String> hashtable = new Hashtable<>();
		Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();

		Runnable task1 = () -> {
			for (int i = 1; i <= 1000; i++) {
				hashtable.put(i, "Value " + i);
//				concurrentMap.put(i, "Value " + i);
			}
		};
		
		Runnable task2 = () -> {
			for (int i = 1; i <= 1000; i++) {
//				hashtable.put(i, "Value " + i);
				concurrentMap.put(i, "Value " + i);
			}
		};


//		ExecutorService executor = Executors.newFixedThreadPool(10);
//		long start1 = System.currentTimeMillis();
//		for (int i = 0; i < 10; i++)
//			executor.submit(task);
//		executor.shutdown();
//		executor.awaitTermination(1, TimeUnit.MINUTES);
//		long end1 = System.currentTimeMillis();
//		System.out.println("Hashtable time: " + (end1 - start1));
//
//		executor = Executors.newFixedThreadPool(10);
//		long start2 = System.currentTimeMillis();
//		for (int i = 0; i < 10; i++)
//			executor.submit(task);
//		executor.shutdown();
//		executor.awaitTermination(1, TimeUnit.MINUTES);
//		long end2 = System.currentTimeMillis();
//		System.out.println("ConcurrentHashMap time: " + (end2 - start2));
		
		
		long start1 = System.nanoTime();
		new Thread(task1).start();
		long end1 = System.nanoTime();
		System.out.println("Hashtable time: " + (end1 - start1));

		long start2 = System.nanoTime();
		new Thread(task2).start();
		long end2 = System.nanoTime();
		System.out.println("ConcurrentHashMap time: " + (end2 - start2));
	}

}
