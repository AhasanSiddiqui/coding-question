/** 
 * String[] input={"100","111","10100","10","1111"}
 * output=2;
 * 
 * String[] input={"01","01010","1000","10","011"}
 * output=3;
 * 
 * Count the strings having prefix"10","01" but "10","01" not included
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX18CountStringsPrefix {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int size = in.nextInt();

		String[] input = new String[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < input.length; i++) {
			input[i] = in.next();
		}
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > 2 && input[i] != "10" && input[i] != "01"
					&& (input[i].startsWith("01") || input[i].startsWith("10"))) {
				count++;
			}
		}

		System.out.println("Count is " + count);

	}
}