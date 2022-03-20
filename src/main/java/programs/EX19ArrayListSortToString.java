/**
 * ArrayList input={"a","d","c","b"};
 * String[] output={"a","b","c","d"}; 
 */

package com.ahasan.arraysdemo.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX19ArrayListSortToString {
	public static void main(String args[]) {

		List<String> input = new ArrayList<String>();
		input.add("a");
		input.add("d");
		input.add("c");
		input.add("b");

		Collections.sort(input);

		String[] output = input.toArray(new String[input.size()]);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}
}
