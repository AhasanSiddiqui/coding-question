/**
 * Sum of odd number within the input range:
 * input=9;
 * output=1+3+5+7+9=25
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX22SumOfOddNumbersWithinRange {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int input = in.nextInt();
		int output = 0;
		for (int i = 1; i <= input; i++) {
			if (i % 2 != 0) {
				output = output + i;
			}
		}
		System.out.println("Sum of Odd Numbers is " + output);
	}
}
