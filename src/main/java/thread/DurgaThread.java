package com.ahasan.arraysdemo.thread;

public class DurgaThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Lazy Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("I got Interrupted ");
			}
		}
	}
}
class InterruptDemo {
	public static void main(String[] args) {
		DurgaThread durgaThread=new DurgaThread();
		durgaThread.start();
		durgaThread.interrupt();
		System.out.println(Thread.currentThread().getName()+" Ends ");
	}
}