/** Square root calculation
 * ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
 * o/p should be rounded off to int;
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;

public class EX08SquareRootCalculation {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Value of X1 and X2 : ");
		double x1 = in.nextDouble();
		double x2 = in.nextDouble();
		System.out.println("Enter the Value of Y1 and Y2 : ");
		double y1 = in.nextDouble();
		double y2 = in.nextDouble();

		double sum = ((x1 + x2) * (x1 + x2)) + ((y1 + y2) * (y1 + y2));

		int output = (int) Math.sqrt(sum);
		System.out.println("Square root is " + output);

	}
}
