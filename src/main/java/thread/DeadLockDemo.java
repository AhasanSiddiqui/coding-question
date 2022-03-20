package com.ahasan.arraysdemo.thread;

public class DeadLockDemo {
	public static void main(String[] args) {
		Object lock1=new Object();
		Object lock2=new Object();

		AhasanThread2 ahasanThread2=new AhasanThread2(lock1,lock2);
		AhasanThread3 ahasanThread3=new AhasanThread3(lock2,lock1);

		Thread thread2 =new Thread(ahasanThread2,"T1");
		Thread thread3 =new Thread(ahasanThread3,"T2");

		thread2.start();
		thread3.start();
	}
}
