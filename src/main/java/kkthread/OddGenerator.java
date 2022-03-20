package com.ahasan.arraysdemo.kkthread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OddGenerator extends Thread {
	private OddEvenGenerator oddEvenGenerator;
	private int totalNumberInSequence;

	@Override
	public void run() {
		for (int i = 2; i < totalNumberInSequence; i=i+2) {
			oddEvenGenerator.printOdd(i);
		}

	}
}
