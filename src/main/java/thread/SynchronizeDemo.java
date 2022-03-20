package com.ahasan.arraysdemo.thread;

class Display {
	public void wish(String name) throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(2000);
				System.out.println("Good Morning ");
				System.out.println(name);
			}
		}
	}
}

class AhasanThread extends Thread {

	Display d;
	String name;

	AhasanThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class SynchronizeDemo {
	public static void main(String[] args) {
		Display display1 = new Display();
		//Display display2 = new Display();
		String dhoni = "Dhoni";
		String yuvraaj = "YuvRaj";
		AhasanThread ahasanThread1 = new AhasanThread(display1, dhoni);
		AhasanThread ahasanThread2 = new AhasanThread(display1, yuvraaj);
		ahasanThread1.start();
		ahasanThread2.start();
	}
}
