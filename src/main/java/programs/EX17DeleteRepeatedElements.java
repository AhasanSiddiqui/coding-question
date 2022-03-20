/** INPUT1= helloworld
 * O/P= hewrd;
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX17DeleteRepeatedElements {
	public static void main(String args[]) {
		String output = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String input1 = in.next();

		StringBuffer sb = new StringBuffer(input1);

		for (int i = 0; i < sb.length(); i++) {
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb = sb.deleteCharAt(j);
				}
			}
		}
		output = sb.toString();
		System.out.println("Output String is " + output);
	}
}
