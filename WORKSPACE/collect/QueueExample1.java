package com.collect;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample1 {
	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>();

		queue.add(null);

		System.out.println(queue.poll());
		System.out.println(queue.remove());
	}
}
