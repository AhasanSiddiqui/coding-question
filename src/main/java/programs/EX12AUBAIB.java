/** (AUB)-(A∩B)
 * O/P in string array;
 */

package com.ahasan.arraysdemo.programs;

import java.util.Set;
import java.util.TreeSet;

public class EX12AUBAIB {
	public static void main(String args[]) {
		// A
		Set<String> a = new TreeSet<String>();
		a.add("apple");
		a.add("orange");
		a.add("grapes");
		System.out.println(a);

		// B
		Set<String> b = new TreeSet<String>();
		b.add("apple");
		b.add("pomegranate");
		b.add("strawberry");
		System.out.println(b);

		// AUB
		Set<String> c = new TreeSet<String>(a);
		c.addAll(b);
		System.out.println(c);

		// A∩B
		Set<String> d = new TreeSet<String>(a);
		d.retainAll(b);
		System.out.println(d);

		// (AUB)-(A∩B)
		Set<String> e = new TreeSet<String>(c);
		e.removeAll(d);
		System.out.println(e);

		String[] arr = e.toArray(new String[e.size()]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}