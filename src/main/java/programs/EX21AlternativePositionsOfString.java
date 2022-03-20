/**
 * input="hello"
 * output="hlo"; Alternative positions
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX21AlternativePositionsOfString {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = in.next();
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			if ((2 * i) < input.length()) {
				output = output + input.charAt(2 * i);
			}
		}
		System.out.println("Output String is " + output);
	}
}
