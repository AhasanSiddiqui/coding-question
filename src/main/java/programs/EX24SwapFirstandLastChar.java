/**
 * Input1=�Hello World�;
 * Output = �dello WorlH�
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX24SwapFirstandLastChar {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String input = in.nextLine();
		String output = "";

		char[] a = input.toCharArray();
		char first = a[0];
		char last = a[a.length - 1];

		a[0] = last;
		a[a.length - 1] = first;

		for (int i = 0; i < a.length; i++) {
			output = output + a[i];
		}
		output = output.toString();

		System.out.println("Output String is " + output);
	}

}
