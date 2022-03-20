/**
 * Validate the age
 * String  input="26"
 * boolean output
 * --1st character in input1 should be digit
 * --input should be greater than zero
 * --age should be between 21 and 45 (inclusive 21 and 45)
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX45AgeValidation {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = in.next();

		boolean output = false;

		if (Character.isDigit(input.charAt(0))) {
			int age = Integer.parseInt(input);
			if (age >= 21 && age <= 45) {
				output = true;
			}
		}
		System.out.println("Age Status is " + output);
	}
}
