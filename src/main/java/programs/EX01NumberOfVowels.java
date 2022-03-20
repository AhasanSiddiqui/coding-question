/** 1.Find the number of vowels in a given string
 * Input1:�Newyork�
 * Output1:2
 * Hint: Irrespective  of case
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX01NumberOfVowels {
	public static void main(String args[]) {
		int output1 = 0; // Number of vowels
		String input1; // Input String

		System.out.println("Enter the String : ");
		Scanner in = new Scanner(System.in);
		input1 = in.nextLine();

		input1 = input1.toLowerCase(); // Converts into lower case
		for (int i = 0; i < input1.length(); i++) {
			char a = input1.charAt(i);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				output1++;
			}
		}
		System.out.println("Number of Vowels is " + output1);
	}
}