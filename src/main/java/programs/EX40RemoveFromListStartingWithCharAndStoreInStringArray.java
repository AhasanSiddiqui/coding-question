/**
 * input1-List1-{apple,orange,grapes}
 * input2-List2-{melon,apple,mango}
 * output={mango,orange}
 * operation-- In 1st list remove strings starting with 'a' or 'g'
 * In 2nd list remove strings ending with 'm' or 'e'
 * Ignore case
 * return in string array
 */

package com.ahasan.arraysdemo.programs;

import java.util.ArrayList;
import java.util.List;

public class EX40RemoveFromListStartingWithCharAndStoreInStringArray {
	public static void main(String args[]) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("grapes");
		list1.add("orange");
		list1.add("grapes");
		System.out.println(list1);

		List<String> list2 = new ArrayList<String>();
		list2.add("Melon");
		list2.add("apple");
		list2.add("mango");
		System.out.println(list2);

		// List 1
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).startsWith("A") || list1.get(i).startsWith("a")
					|| list1.get(i).startsWith("G")
					|| list1.get(i).startsWith("g")) {
				list1.remove(i);
				i--;
			}
		}
		System.out.println(list1);

		// List 2
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).endsWith("M") || list2.get(i).endsWith("m")
					|| list2.get(i).endsWith("E") || list2.get(i).endsWith("e")) {
				list2.remove(i);
				i--;
			}
		}
		System.out.println(list2);

		// Storing both the list elements in String array
		list1.addAll(list2);
		String[] output = new String[list1.size()];
		list1.toArray(output);

		System.out.println("Array Elements are : ");
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
