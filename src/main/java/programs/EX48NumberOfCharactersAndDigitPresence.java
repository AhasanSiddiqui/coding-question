/**
 * Check if the No of characters in a string greater than 3 and if there are digits output=false;
 * check  if length of word is greater than 3 and there are no digits then = true 
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX48NumberOfCharactersAndDigitPresence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = in.next();

		boolean output = false;
		int count = 0;
		if (input.length() > 3) {
			for (int i = 0; i < input.length(); i++) {
				if (Character.isDigit(input.charAt(i))) {
					count++;
				}
			}
			if (count == 0) {
				output = true;
			} else {
				output = false;
			}
		}

		System.out.println("Output Status is " + output);
	}
}
