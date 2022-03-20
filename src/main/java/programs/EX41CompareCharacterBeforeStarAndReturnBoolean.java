/**
 * input1- Hello*world
 * output-- boolean(true or false)
 * operation-- if the character before and after * are same return true else false
 * if there in no star in the string return false
 * Ignore case
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX41CompareCharacterBeforeStarAndReturnBoolean {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = in.next();
		boolean output = false;

		if (input.contains("*")) {
			int index = input.indexOf('*');
			String before = "" + input.charAt(index - 1);
			String next = "" + input.charAt(index + 1);
			if (before.equalsIgnoreCase(next)) {
				output = true;
			} else {
				output = false;
			}

		}
		System.out.println("Status is " + output);
	}
}