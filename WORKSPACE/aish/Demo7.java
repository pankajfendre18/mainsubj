package com.aish;
class MyThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
	}
}

public class Demo7 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			MyThread task = new MyThread();
			task.start();
		}

	}

}
