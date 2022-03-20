/*
 * Input1=23 (int)
 * input2=2  (int)
 * input3='*' (char)
 * output=46   (int)
 * Input3 can be any of these '+','-''*','/','%'. Perform the calculator operations.
 */

package com.ahasan.arraysdemo.programs;

import java.io.IOException;
import java.util.Scanner;

public class EX58ArithmeticOperationsSwitchCase {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input1 and Input2 : ");
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		System.out.println("Enter the Input 3 : ");
		char input3 = (char) System.in.read();
		int output = 0;

		switch (input3) {
		case '+':
			output = input1 + input2;
			break;
		case '-':
			output = input1 - input2;
			break;
		case '*':
			output = input1 * input2;
			break;
		case '/':
			output = input1 / input2;
			break;
		case '%':
			output = input1 % input2;
			break;
		default:
			output = 0;
		}
		System.out.println("Output is " + output);

	}
}
