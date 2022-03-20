/**Numbers - 49-57
 * Upper - 65-90
 * Lower - 97-122
 */

package com.ahasan.arraysdemo.programs;

public class EX76CompareCharacteswithASCII {

	public static void main(String[] args) {
		String input = "S562";
		char first = input.charAt(0);
		char second = input.charAt(1);
		char third = input.charAt(2);
		boolean output = false;
		int f = first;
		int s = second;
		int t = third;

		if (f >= 65 && f <= 90 || f >= 97 && f <= 122 || f >= 49 && f <= 57) {
			if (s >= 65 && s <= 90) {
				if (t >= 49 && t <= 57) {
					if (input.length() == 4) {
						output = true;
					}
				}
			}
		}
		System.out.println(output);

	}

}
