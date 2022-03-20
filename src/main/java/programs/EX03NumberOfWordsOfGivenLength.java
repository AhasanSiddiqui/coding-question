/** Find the number of words are of given length
 * Input1:{�aa�,�b�,�cc�,�ddd�}
 * Input2:2
 * Output1:2
 */


package com.ahasan.arraysdemo.programs;
import java.util.Scanner;

public class EX03NumberOfWordsOfGivenLength {
	public static void main(String args[]) {

		int input2; // Size of words that needs to be counted
		int input3; // Size of the Array
		int output1 = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Array Size : ");
		input3 = in.nextInt();

		String[] input1 = new String[input3];

		System.out.println("Enter the Words : ");

		for (int i = 0; i < input1.length; i++) {
			input1[i] = in.next();
		}

		System.out.println("Enter the length of words to be counted : ");
		input2 = in.nextInt();

		for (int i = 0; i < input1.length; i++) {
			if (input1[i].length() == input2) {
				output1++;
			}
		}

		System.out.println("Number of words is " + output1);
	}
}
