/**
 * Input1=�I love my country�
 * Output- �I Love My Country� 
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EX23CamelCaseString {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String input = in.nextLine();
		String output = "";

		StringTokenizer st = new StringTokenizer(input);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			token = token.substring(0, 1).toUpperCase()
					+ token.substring(1).toLowerCase();
			output = output + token + " ";
		}
		output = output.trim().toString();

		System.out.println(output);
	}
}
