package com.ahasan.arraysdemo.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceCondition {
	public static void main(String[] args) {
		AtomicInteger x = new AtomicInteger();
		new Thread(new Runnable() {
			@Override
			public void run() {
				//x=3;
			}
		}).start();

		new Thread(() -> {
			x.set(7);
		}).start();
	}
}
