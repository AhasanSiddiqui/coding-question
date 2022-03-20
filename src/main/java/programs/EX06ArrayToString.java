/** Convert the Array into a String
 * String[] input1=["Vikas","Lokesh",Ashok]
 * Expected output String: "Vikas,Lokesh,Ashok"
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX06ArrayToString {
	public static void main(String[] args) {
		int input2; // Array Size
		String output; // Output String

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Size : ");
		input2 = in.nextInt();

		System.out.println("Enter the String : ");
		String[] input1 = new String[input2];

		for (int i = 0; i < input1.length; i++) {
			input1[i] = in.next();
		}

		output = "\"" + input1[0];
		for (int i = 1; i < input1.length; i++) {

			output = output.concat(",");
			output = output.concat(input1[i]);

		}
		output = output + "\"";

		System.out.println(output);

	}
}
