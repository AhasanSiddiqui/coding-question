package com.ahasan.arraysdemo.thread;// Java program for the above approach

public class GFG {

	static int N;
	// Starting counter
	int counter = 1;

	// Driver Code
	public static void main(String[] args) {
		// Given Number N
		N = 10;
		// Create an object of class
		GFG mt = new GFG();
		// Create thread t1 and start
		new Thread(() -> mt.printEvenNumber()).start();
		// Create thread t2 and start
		new Thread(() -> mt.printOddNumber()).start();
	}

	// Function to print odd numbers
	public void printOddNumber() {
		synchronized (this) {
			// Print number till the N
			while (counter < N) {

				// If count is even then print
				while (counter % 2 == 0) {

					// Exception handle
					try {
						wait();
					} catch (
							InterruptedException e) {
						e.printStackTrace();
					}
				}
				// Print the number
				System.out.println("Odd " + counter);
				// Increment counter
				counter++;
				// Notify to second thread
				notify();
			}
		}
	}

	// Function to print even numbers
	public void printEvenNumber() {
		synchronized (this) {
			// Print number till the N
			while (counter < N) {
				// If count is odd then print
				while (counter % 2 == 1) {
					// Exception handle
					try {
						wait();
					} catch (
							InterruptedException e) {
						e.printStackTrace();
					}
				}
				// Print the number
				System.out.println("Even " +
						counter);
				// Increment counter
				counter++;
				// Notify to 2nd thread
				notify();
			}
		}
	}
}
