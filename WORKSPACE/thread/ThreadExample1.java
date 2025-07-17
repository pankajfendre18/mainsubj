package com.thread;

import java.util.concurrent.Callable;

public class ThreadExample1 extends Thread implements Runnable, Callable<ThreadExample1>{

	public static ThreadExample1 t1;
	public static ThreadExample1 t2;

	public static void main(String[] args) {
		t1 = new ThreadExample1();
		t2 = new ThreadExample1();
		System.out.println(t1.getName()+ " : 1 : " + t1.getState());
		t1.start();
		System.out.println(t1.getName()+ " : 2 : " + t1.getState());
		
		System.out.println("t21 : " + t2.getState());
		t2.start();
		System.out.println("t22 : " + t2.getState());
	}

	@Override
	public ThreadExample1 call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void run() {
		try {
			System.out.println(t1.getName()+ " : 3 : " + t1.getState());
			System.out.println("t23 : " + t2.getState());
			Thread.sleep(100);
			System.out.println(t1.getName()+ " : 4 : " + t1.getState());
			System.out.println("t24 : " + t2.getState());
//			t1.join(100);
			System.out.println(t1.getName()+ " : 5 : " + t1.getState());
			System.out.println("t25 : " + t1.getState());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
