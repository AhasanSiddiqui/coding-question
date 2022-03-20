/**
 * input1=1,inoput2=2,onput3=3 --- output=6;
 * input1=1,inoput2=13,onput3=3 --- output=1;
 * input1=13,inoput2=2,onput3=8 --- output=8;
 * if value equal to 13,escape the 13 value as well as next value to 13.sum the remaining values
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX20CalculateEscape13 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Inputs : ");
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int input3 = in.nextInt();

		int[] a = { input1, input2, input3 };

		int output = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 13) {
				i = i + 1;
			} else {
				output = output + a[i];
			}
		}
		System.out.println("Sum is " + output);
	}
}
