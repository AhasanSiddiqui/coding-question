/**Collect no�s  from  list1 which is not present in list2 & Collect no�s  from  list2 which is not present in list1 and store
 * input1={1,2,3,4}; 
 * input2={1,2,3,5};
 * int[] output={4,5};
 */

package com.ahasan.arraysdemo.programs;

import java.util.ArrayList;
import java.util.List;

public class EX25ListDifferenceToIntArray {
	public static void main(String args[]) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(5);

		List<Integer> c = new ArrayList<Integer>(a);
		List<Integer> d = new ArrayList<Integer>(b);

		// A-B
		c.removeAll(b);
		System.out.println(c);

		// B-A
		d.removeAll(a);
		System.out.println(d);

		// C+D
		c.addAll(d);

		Integer[] output = new Integer[c.size()];
		c.toArray(output);
		// Wrapper classes should be used when converting from collections

		System.out.println("Array Elements are : ");
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}