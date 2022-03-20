package com.ahasan.arraysdemo.thread;

import java.util.concurrent.CountDownLatch;

public class AssignedTaskManagerTask {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(2);

		DevTeam devTeam1 = new DevTeam(countDownLatch, "DevTeam-A");
		DevTeam devTeam2 = new DevTeam(countDownLatch, "DevTeam-B");

		devTeam1.start();
		devTeam2.start();

		countDownLatch.await();
		DevTeam qaTeam = new DevTeam(countDownLatch, "QATeam");
		qaTeam.start();
	}
}
