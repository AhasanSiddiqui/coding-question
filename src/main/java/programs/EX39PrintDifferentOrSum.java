/**
 * Input---input1=1;
 * input2=4;
 * input3=1;
 * output1=4;
 * input---input1=1;
 * input2=2;
 * input3=3;
 * output1=6;
 * Operation--- print the element which is not repeated
 * if all the inputs r different sum all inputs 
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX39PrintDifferentOrSum {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Inputs 1,2 and 3 : ");
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int input3 = in.nextInt();
		int output = 0;

		int[] a = { input1, input2, input3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[i] = 0;
					a[j] = 0;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			output = output + a[i];
		}
		System.out.println("Output is " + output);
	}
}
