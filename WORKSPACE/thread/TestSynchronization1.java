package com.thread;

class Table {
	// Synchronized method to print the table
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			// Print the multiplication result
			System.out.println(n * i);
			try {
				// Pause execution for 400 milliseconds
				Thread.sleep(500);
			} catch (Exception e) {
				// Handle any exceptions
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	// Constructor to initialize Table object
	MyThread1(Table t) {
		this.t = t;
	}

	// Run method to execute thread
	public void run() {
		// Call synchronized method printTable with argument 5
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;

	// Constructor to initialize Table object
	MyThread2(Table t) {
		this.t = t;
	}

	// Run method to execute thread
	public void run() {
		// Call synchronized method printTable with argument 100
		t.printTable(100);
	}
}

public class TestSynchronization1 {
	public static void main(String args[]) {
		// Create a Table object
		Table obj = new Table();
		// Create MyThread1 and MyThread2 objects with the same Table object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		// Start both threads
		t1.start();
		t2.start();
	}
}
