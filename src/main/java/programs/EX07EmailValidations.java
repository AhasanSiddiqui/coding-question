/** Email Validation
 * String input1="test@gmail.com"
 * 1)@ & . should be present;
 * 2)@ & . should not be repeated;
 * 3)there should be four characters between @ and .;
 * 4)there should be at least 3 characters before @ ;
 * 5)the end of mail id should be .com;
 */

// Using String
package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX07EmailValidations {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Email ID : ");
		String email = in.next();

		int length = email.length();
		int ampindex = email.indexOf('@');
		int dotindex = email.indexOf('.');
		int amp1index = email.lastIndexOf('@');
		int dot1index = email.lastIndexOf('.');
		if (ampindex > 0 && dotindex > 0) {

			String username = email.substring(0, ampindex);
			int lenusername = username.length();

			String org = email.substring(ampindex + 1, dotindex);
			int lenorg = org.length();

			String domain = email.substring(dotindex, length);

			if (ampindex == amp1index && dotindex == dot1index && lenorg == 4
					&& lenusername > 2 && domain.equals(".com")) {
				System.out.println("Valid Email");
			} else {
				System.out.println("Invalid Email");
			}
		} else {
			System.out.println("Invalid Email");
		}
	}
}
