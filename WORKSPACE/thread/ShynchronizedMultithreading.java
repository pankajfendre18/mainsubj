package com.thread;

class Sender {
	public void SenderMsg(String msg) {
		System.out.println("Sending a Message :: " + msg);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println(msg + "Sent");
	}
}

class SenderWThreads extends Thread {
	private String msg;
	Sender sd;

	SenderWThreads(String m, Sender obj) {
		msg = m;
		sd = obj;
	}

	public void run() {
		synchronized (sd) {
			sd.SenderMsg(msg);
		}
	}
}

// Driver Code   
public class ShynchronizedMultithreading {
	public static void main(String args[]) throws Exception {
		Sender sender = new Sender();
		SenderWThreads sender1 = new SenderWThreads("Hola ", sender);
		SenderWThreads sender2 = new SenderWThreads("Welcome to Javatpoint website ", sender);

		sender1.start();
		sender2.start();

//		sender1.join();
//		sender2.join();
	}
}