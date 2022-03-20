package com.ahasan.arraysdemo.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBQ {
	public static void main(String[] args) {
		BlockingQueue<Item> items=new ArrayBlockingQueue<>(10);

		final Runnable runnable=new Thread(()->{
			while (true) {
				//items.put(createItem());
			}
		});

	}
}
