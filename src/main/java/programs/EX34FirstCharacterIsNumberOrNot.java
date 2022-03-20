/**
 * If first char of string is a number then false else true.
 * 12DFGR=false;
 * SDFG=True;
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX34FirstCharacterIsNumberOrNot {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = in.next();
		boolean output = false;

		char first = input.charAt(0);

		if (Character.isDigit(first)) {
			output = true;
		} else {
			output = false;
		}
		System.out.println("Output Status is : " + output);

	}
}
