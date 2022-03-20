package com.ahasan.arraysdemo.array;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadEvenOdd {
	final static AtomicInteger atomicInteger = new AtomicInteger(0);

	public static void main(String[] args) {
		Runnable runnable = () -> {
			while (atomicInteger.get() < 10) {
				synchronized (atomicInteger) {
					if (atomicInteger.get() % 2 == 0 && "Even".equalsIgnoreCase(Thread.currentThread().getName())) {
						System.out.println("Even : " + atomicInteger.getAndIncrement());
					} else {
						System.out.println("Odd : " + atomicInteger.getAndIncrement());
					}
				}
			}
		};
		Thread thread1 = new Thread(runnable, "Even");
		Thread thread2 = new Thread(runnable, "Odd");
		thread1.start();
		thread2.start();
	}
}
