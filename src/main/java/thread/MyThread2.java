package com.ahasan.arraysdemo.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread2 extends Thread{

	public static void main(String[] args){
		int countProcessors=Runtime.getRuntime().availableProcessors();
		ExecutorService executorService=Executors.newFixedThreadPool(countProcessors);
		for (int i=0;i<100;i++) {
			executorService.execute(new MyThread2());
		}
	}
}
