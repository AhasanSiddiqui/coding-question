/** convert decimal to binary;
 * o/p is int;
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX13DecimalToBinary {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Decimal Value : ");
		int decimal = in.nextInt();

		int binary = 0;
		int base = 1;
		int rem = 1;

		while (decimal != 0) {
			rem = decimal % 2;
			binary = binary + (rem * base);
			decimal = decimal / 2;
			base = base * 10;
		}

		System.out.println("Binary Value is " + binary);

	}
}
