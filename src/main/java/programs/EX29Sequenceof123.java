/**
 * int[] input={2,1,4,1,2,3,6};
 * check whether the input is the sequence of 1,2,3
 * if so-output=true;
 * int [] input={12,1,3,4,5,6};
 * output=false;
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX29Sequenceof123 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		boolean output = true;

		System.out.println("Enter the Size : ");
		int size = in.nextInt();

		int[] input = new int[size];
		System.out.println("Enter the Array Values : ");

		for (int i = 0; i < input.length; i++) {
			input[i] = in.nextInt();
		}

		int count = 0;
		for (int i = 0; i < input.length - 2; i++) {
			if (input[i] == 1 && input[i + 1] == 2 && input[i + 2] == 3) {
				count++;
			}
		}

		if (count >= 1) {
			output = true;
		} else {
			output = false;
		}

		System.out.println("Output Status is " + output);

	}
}
