package com.ahasan.arraysdemo.thread;

public class AhasanThread2 implements Runnable{

	private Object lock1;
	private Object lock2;

	public AhasanThread2(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		synchronized (lock1) {
			System.out.println(Thread.currentThread().getName()+" locked resource1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (lock2) {
				System.out.println(Thread.currentThread().getName()+" locked resource2");
			}
		}

	}
}
