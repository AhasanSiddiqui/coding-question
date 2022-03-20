/** input 1[]={"abc","da","ram"};
 * input 2=3;
 * o/p= string ="c$m";
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX14CheckTheStringSizeAndTakeLastDigit {
	public static void main(String args[]) {
		String output = "";

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int size = in.nextInt();

		String[] input = new String[size];
		System.out.println("Enter the elements of the Array : ");
		for (int i = 0; i < input.length; i++) {
			input[i] = in.next();
		}

		System.out.println("Enter the size of the string to be checked : ");
		int input2 = in.nextInt();

		char c;
		for (int i = 0; i < input.length; i++) {

			if (input[i].length() == input2) {
				c = input[i].charAt(input2 - 1);
				output = output + c;
			} else {
				output = output.concat("$");
			}
		}
		System.out.println("Output String is " + output);
	}
}
