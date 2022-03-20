package com.ahasan.arraysdemo.array;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class HclThreadTest {

	static int N;
	int counter;

	public HclThreadTest(int counter) {
		this.counter = counter;
	}

	public static void main(String[] args) {

		Iterable<String> iterable= Arrays.asList("Ahasan","Siddiqui","Java8");

		StreamSupport.stream(iterable.spliterator(),false).forEach(System.out::println);
		HclThreadTest hclThreadTest = new HclThreadTest(1);
		N=10;
		new Thread(() -> hclThreadTest.printEven()).start();
		new Thread(() -> hclThreadTest.printOdd()).start();
	}

	public void printEven() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even : " + counter);
				counter++;
				notify();
			}
		}
	}

	public void printOdd() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd : " + counter);
				counter++;
				notify();
			}
		}
	}
}
