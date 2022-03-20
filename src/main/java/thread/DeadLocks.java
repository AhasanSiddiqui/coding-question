package com.ahasan.arraysdemo.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLocks {
	public static void main(String[] args) {
		DeadLocks deadLocks=new DeadLocks();

		new Thread(deadLocks::worker1,"Worker1").start();
		new Thread(deadLocks::worker2,"Worker2").start();
	}

	private Lock lock1=new ReentrantLock();
	private Lock lock2=new ReentrantLock();

	public void worker1() {
		lock1.lock();
		System.out.println("Worker1 acquires the lock1");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock2.lock();
		System.out.println("Worker2 acquires the lock1");
		lock1.unlock();
		lock2.unlock();
	}


	public void worker2() {
		lock2.lock();
		System.out.println("Worker2 acquires the lock1");
		try {
			Thread.sleep(300);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock1.lock();
		System.out.println("Worker1 acquires the lock1");
		lock2.unlock();
		lock1.unlock();
	}

}
