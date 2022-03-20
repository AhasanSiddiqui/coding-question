package com.ahasan.arraysdemo.thread;

public class TestThreads {
	public static void main(String[] args) {
		Runnable runnable1=() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getId());
				System.out.println(Thread.currentThread().getPriority());
			}
		};

		Runnable runnable2=() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getId());
				System.out.println(Thread.currentThread().getPriority());
			}
		};

		new Thread(runnable1,"T1").start();
		new Thread(runnable1,"T2").start();
	}
}
