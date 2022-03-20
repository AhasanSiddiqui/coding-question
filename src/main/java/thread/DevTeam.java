package com.ahasan.arraysdemo.thread;

import java.util.concurrent.CountDownLatch;

public class DevTeam extends Thread {
	CountDownLatch countDownLatch;

	public DevTeam(CountDownLatch countDownLatch, String name) {
		super(name);
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		System.out.println("Task Assigned to Development team " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task Finished By Development team " + Thread.currentThread().getName());
		countDownLatch.countDown();
	}
}
