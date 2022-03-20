/**
 * Count the number of occurrences of substring in a string
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX54NumberOfOccurencesOfSubstring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String input = in.next();
		System.out.println("Enter the Substring to Count : ");
		String input2 = in.next();

		int index = 0;
		int count = 0;

		while (index != input.length()) {
			index = input.indexOf(input2, index);
			if (index != -1) {
				count++;
				index = index + input2.length();
			} else {
				index = index + 1;
			}
		}
		System.out.println("Count is " + count);

	}
}
