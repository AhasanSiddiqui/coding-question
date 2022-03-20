/** Find the sum of maximum and minimum number from a given input array
 * Input:{19,17,12}
 * Output:31
 */

package com.ahasan.arraysdemo.programs;

import java.util.Arrays;
import java.util.Scanner;

public class EX02SumOfMaxAndMinOfArray {
	public static void main(String args[]) {
		int input2; // Array Size

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Array Size : ");
		input2 = in.nextInt();

		int[] input1 = new int[input2]; // Array with Size input2
		System.out.println("Enter the Array Elements ");

		for (int i = 0; i < input1.length; i++) {
			input1[i] = in.nextInt();
		}

		Arrays.sort(input1);

		int output1 = input1[0] + input1[input1.length - 1]; // Sum
		System.out.println("Sum of Min and Max in Array is " + output1);
	}
}
