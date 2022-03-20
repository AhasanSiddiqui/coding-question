package com.ahasan.arraysdemo.kkthread;

public class TestEvenOdd {
	public static void main(String[] args) {
		OddEvenGenerator oddEvenGenerator=new OddEvenGenerator();
		EvenGenerator evenGenerator=new EvenGenerator(oddEvenGenerator,20);
		OddGenerator oddGenerator=new OddGenerator(oddEvenGenerator,20);

		Thread thread1=new Thread(oddGenerator);
		Thread thread2=new Thread(evenGenerator);

		thread1.start();
		thread2.start();
	}
}
