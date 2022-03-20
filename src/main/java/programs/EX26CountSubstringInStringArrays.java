/**
 * String array will be given. 
 * If a string is Prefix of an any other string in that array means count 
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX26CountSubstringInStringArrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = in.nextInt();

		String[] input = new String[size];
		System.out.println("Enter the Array Values : ");
		for (int i = 0; i < input.length; i++) {
			input[i] = in.next();
		}

		int output = 0;
		int count;
		for (int i = 0; i < input.length; i++) {
			count = 0;
			for (int j = 0; j < input.length; j++) {

				if (input[j].contains(input[i])) {
					count++;
				}
			}
			if (count > 1) {
				output++;
			}
		}
		System.out.println("Count is " + output);

	}
}
