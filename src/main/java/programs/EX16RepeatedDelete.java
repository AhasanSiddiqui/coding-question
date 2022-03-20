package com.ahasan.arraysdemo.programs;
/** INPUT1= helloworld
 * INPUT2= 2
 * O/P= helwrd;
 */

import java.util.Scanner;

public class EX16RepeatedDelete {
	public static void main(String args[]) {
		String output = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String input1 = in.next();

		System.out.println("Enter the No of Repeated Elements : ");
		int input2 = in.nextInt();

		char[] arr = input1.toCharArray();

		char[] arr1 = new char[arr.length];

		int count;

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			char val = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}

			// Count<input2
			if (count < input2) {
				arr1[i] = arr[i];
			}

			// Count=Input2
			else if (count == input2) {
				arr1[i] = ' ';
			}

			// Count>input2

			else if (count > input2) {

				int index = count - input2;

				for (int k = 0; k < arr.length; k++) {
					if (arr[k] == val) {
						if (index > 0) {
							arr1[k] = val;
							index--;
						} else {
							arr1[k] = ' ';
						}
					}
				}
			}
		}

		// Printing char array
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != ' ') {
				output = output + arr1[i];
			}
		}

		output = output.toString();
		System.out.println(output);

	}
}