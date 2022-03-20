/** .Create a program to get the Hashmap from the given input string array where the key for the hashmap is first three letters of array element in uppercase and the value of hashmap is the element itself
 * Input:{�Goa�,�kerala�,�gujarat�} [string array]
 * Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}} [hashmap]
 */

package com.ahasan.arraysdemo.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EX05HashMap {
	public static void main(String[] args) {
		int input2; // Array Size
		Scanner in = new Scanner(System.in);

		Map<String, String> map = new HashMap<String, String>();

		System.out.println("Enter the Size : ");
		input2 = in.nextInt();
		String[] input = new String[input2];

		System.out.println("Enter the String : ");
		for (int i = 0; i < input.length; i++) {
			input[i] = in.next();
		}
		for (int i = 0; i < input.length; i++) {
			map.put((input[i].substring(0, 3)).toUpperCase(), input[i]);
		}

		// for (String i : input) {
		// map.put((i.substring(0, 3)).toUpperCase(), i);
		// }

		System.out.println(map);

	}
}
