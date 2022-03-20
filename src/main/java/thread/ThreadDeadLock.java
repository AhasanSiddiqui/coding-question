package com.ahasan.arraysdemo.thread;

public class ThreadDeadLock {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
		System.out.println("Ahasan");


	}
}
