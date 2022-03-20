/** count the number of words in the string
 * Input string="i work in cognizant"
 * output=4
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EX27CountNumberOfWords {
	public static void main(String[] args) {
		String input;
		int output;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		input = in.nextLine();

		input = input.replace(',', ' ');

		StringTokenizer st = new StringTokenizer(input);
		output = st.countTokens();

		System.out.println(output);

	}
}