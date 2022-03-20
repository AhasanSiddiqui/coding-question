/**
 * Input-- String input1="Lily"
 * int input2=2
 * output-- String output1="LilyLily"
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX38AppendStringsNTimes {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String ");
		String input = in.next();
		String output = "";

		System.out.println("Enter the Input2 ");
		int input2 = in.nextInt();

		for (int i = 0; i < input2; i++) {
			output = output.concat(input);
		}

		System.out.println("Output String is " + output);
	}

}
