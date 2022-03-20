package com.ahasan.arraysdemo.thread;

import java.sql.SQLOutput;

public class MyThread extends Thread{
	@Override
	public void run(){
			System.out.println("Name : "+this.getName() +" Id : "+this.getId());
	}

	public static void main(String[] args){


		for (int i=0; i < 10; i++) {
			MyThread myThread=new MyThread();
			myThread.start();
		}
		System.out.println("Name : "+Thread.currentThread().getName() +" Id : "+Thread.currentThread().getId());

	}
}
