/**
 * string1[]={a,b,c}
 * string2[]={b,c,d}
 * o/p=2
 * if repeated elements are there count only once.
 */

package com.ahasan.arraysdemo.programs;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class EX51CountRepeatedElementsOnlyOnce {
	public static void main(String[] args) {
		int output;
		String[] arr1 = { "a", "b", "c" };
		String[] arr2 = { "b", "c", "d" };

		Set<String> a = new TreeSet<String>(Arrays.asList(arr1));
		Set<String> b = new TreeSet<String>(Arrays.asList(arr2));

		a.retainAll(b);
		output = a.size();

		System.out.println("Repeated Elements is " + output);
	}
}
