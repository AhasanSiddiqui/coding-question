/**
 * Input--String input1="xaXafxsd"
 * String output1="aXafsdxx"
 * operation-- remove the character "x"(only lower case) from string and place at the end 
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX42RemovexAndAppendAtTheEnd {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String input = in.next();
		String output = "";
		int count = 0;
		char c;

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			c = input.charAt(i);
			if (c != 'x') {
				sb.append(c);
			} else {
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			sb.append('x');
		}
		output = sb.toString();

		System.out.println("Output String is " + output);
	}
}
