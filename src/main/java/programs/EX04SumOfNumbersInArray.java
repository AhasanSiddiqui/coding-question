/** Find the sum of the numbers in the given input string array
 * Input{�2AA�,�12�,�ABC�,�c1a�)
 * Output:6 (2+1+2+1)
 * Note in the above array 12 must not considered as such it must be considered as 1,2
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX04SumOfNumbersInArray {
	public static void main(String[] args) {
		int sum = 0;
		int input2; // Array Size
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array : ");
		input2 = in.nextInt();

		String[] input = new String[input2]; // Array
		System.out.println("Enter String : ");
		for (int i = 0; i < input.length; i++) {
			input[i] = in.next();
		}

		char[] a = new char[200]; // Char Array
		for (int i = 0; i < input.length; i++) {
			a = input[i].toCharArray();
		for (int j = 0; j < input[i].length(); j++) {
			if (Character.isDigit(a[j])) {
				sum = Character.getNumericValue(a[j]) + sum;
			}
		}
		}
		System.out.println(sum);
	}
}

