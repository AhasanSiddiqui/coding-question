package com.ahasan.arraysdemo.strings;

public class Ericson2 {
	public static void main(String[] args) {

		EricsonEvenThread ericsonThread1=new EricsonEvenThread();
		Thread thread1=new Thread(ericsonThread1,"T1");
		Thread thread2=new Thread(ericsonThread1,"T2");
		thread1.start();
		thread2.start();
	}

}
class EricsonEvenThread implements Runnable {

	int count=0;
	@Override
	public void run() {
		synchronized (this) {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				printEven(count++);


				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.notify();
			}
		}
	}

	public void printOdd(int count) {
		System.out.println(count);
	}


	public void printEven(int count) {
		System.out.println(count);
	}
}
