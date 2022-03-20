/** 
 * In an integer array, in the first four numbers if 9 is present return true else false.
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX52PresenceOf9InFirstFourPosition {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = in.nextInt();
		int[] input = new int[size];
		boolean output = false;

		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < input.length; i++) {
			input[i] = in.nextInt();
		}

		int index;
		if (input.length > 4) {
			index = 4;
		} else {
			index = input.length;
		}

		for (int i = 0; i < index; i++) {
			if (input[i] == 9) {
				output = true;
			}
		}

		System.out.println("Output Status is " + output);
	}
}
