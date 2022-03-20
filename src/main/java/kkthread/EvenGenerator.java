package com.ahasan.arraysdemo.kkthread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EvenGenerator extends Thread {
	private final OddEvenGenerator evenEvenGenerator;
	private final int totalNumberInSequence;

	@Override
	public void run() {
		for (int i = 1; i < totalNumberInSequence; i=i+2) {
			evenEvenGenerator.printOdd(i);
		}

	}
}
