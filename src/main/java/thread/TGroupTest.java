package com.ahasan.arraysdemo.thread;

public class TGroupTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		System.out.println(Thread.activeCount());

		ThreadGroup threadGroup=new ThreadGroup("Ahasan");
		threadGroup.list();
	}
}
