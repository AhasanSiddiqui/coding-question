/**
 * Prove Whether an number is ISBN number or not
 * input="0201103311"
 * ISBN number:  sum=0*10+2*9+0*8+1*7+1*6+0*5+3*4+3*3+1*2+1*1
 * Sum%11==0 then it is ISBN number
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX55ISBNNumberValidation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ISBN Number : ");
		String input = in.next();
		int sum = 0;
		int weight = 10;
		boolean output = false;

		for (int i = 0; i < input.length(); i++) {
			int c = Integer.valueOf(input.substring(i, i + 1));
			sum = sum + (c * weight);
			weight--;
		}

		if (sum % 11 == 0) {
			output = true;
		}

		System.out.println("The ISBN Number Validation is " + output);

	}
}
