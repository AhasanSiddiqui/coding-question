package com.ahasan.arraysdemo.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
	static AtomicInteger atomicInteger=new AtomicInteger(0);
	public static void main(String[] args) {
		Thread thread1=new Thread(() -> {
			increment(atomicInteger);
		});

		Thread thread2=new Thread(() -> {
			increment(atomicInteger);
		});
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(atomicInteger);
	}

	private static void increment(AtomicInteger atomicInteger) {
		for (int i = 0; i < 20000; i++) {
			atomicInteger.getAndIncrement();
		}
	}
}
