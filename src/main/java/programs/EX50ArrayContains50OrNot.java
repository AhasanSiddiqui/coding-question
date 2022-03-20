/**
 * If given array contains 9 then O/p is true;
 * 
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX50ArrayContains50OrNot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int size = in.nextInt();
		int[] input = new int[size];
		boolean output = false;

		System.out.println("Enter Array Values : ");
		for (int i = 0; i < input.length; i++) {
			input[i] = in.nextInt();
		}

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 9) {
				output = true;
			}
		}
		System.out.println("Output Status is " + output);

	}

}
