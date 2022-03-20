package com.ahasan.arraysdemo.thread;

public class QATeam extends Thread {

	public QATeam(String name) {
		super(name);
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
	}
}
