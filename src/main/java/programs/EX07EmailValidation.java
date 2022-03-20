/** Email Validation
 * String input1="test@gmail.com"
 * 1)@ & : should be present;
 * 2)@ & . should not be repeated;
 * 3)there should be four characters between @ and .;
 * 4)there should be at least 3 characters before @ ;
 * 5)the end of mail id should be .com;
 */

// Using Char array
package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX07EmailValidation {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Email ID : ");
		String email = in.next();
		// Converting string into Char array
		char[] a = new char[200];
		a = email.toCharArray();

		int amp = 0;
		int dot = 0;
		int ampindex = 0;
		int dotindex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == '@') {
				amp++; // amp should be 1
				ampindex = i;
			} else if (a[i] == '.') {
				dot++; // dot should be 1
				dotindex = i;
			}
		}

		if (amp == 1 && dot == 1 && ampindex > 2 && (dotindex - ampindex) == 5
				&& a[a.length - 1] == 'm' && a[a.length - 2] == 'o'
				&& a[a.length - 3] == 'c' && a[a.length - 4] == '.') {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid email");
		}

	}
}
