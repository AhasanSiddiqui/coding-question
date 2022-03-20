package com.ahasan.arraysdemo.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

	public static void main(String[] args) {
		ReentrantLock lock=new ReentrantLock();
		lock.lock();
		lock.lock();
		System.out.println(lock.isLocked());

		System.out.println(lock.isHeldByCurrentThread());

		System.out.println(lock.getQueueLength());
	}
}
