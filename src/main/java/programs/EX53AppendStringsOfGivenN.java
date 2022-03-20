package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX53AppendStringsOfGivenN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String input = in.next();
		System.out.println("Enter the Value of N : ");
		int input2 = in.nextInt();
		String output = "";
		String a = input.substring(input.length() - input2, input.length());
		for (int i = 0; i < input2; i++) {
			output = output + a;
		}
		output = output.toString();

		System.out.println("Output String is " + output);

	}
}
