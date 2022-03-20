/**
 * input1="hello world is good world" (string)
 * input2="world" (string)
 * output=2
 * Count the number of occurrence of the input2. The check must be case sensitive. 
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EX59CountNumberOfOccurrencesOfSubString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String input1 = in.nextLine();
		System.out.println("Enter the Substring : ");
		String input2 = in.next();
		int output = 0;

		StringTokenizer st = new StringTokenizer(input1);
		while (st.hasMoreTokens()) {
			if (st.nextToken().equals(input2)) {
				output++;
			}
		}

		System.out.println("Count is " + output);
	}
}
