/** I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
 * i/p 2="hari";
 * o/p string[]={"ram","cts"}; 
 * Store the key values of the hashmap in the output string[] corresponding to the given input2      
 */

package com.ahasan.arraysdemo.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EX11HashMap {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		Map<String, String> map = new HashMap<String, String>();
		map.put("ram", "hari");
		map.put("cisco", "barfi");
		map.put("honeywell", "cs");
		map.put("cts", "hari");
		map.put("ram", "hari");

		System.out.println(map);

		System.out.println("Enter the Input String : ");
		String input2 = in.next();

		int i = 0;
		String[] q = new String[100];
		for (String a : map.keySet()) {
			if (map.get(a).equals(input2)) {
				// a - key
				// map.get(a) - Value at key i
				q[i++] = a;
			}
		}

		for (int j = 0; j < i; j++) {
			System.out.println(q[j]);
		}
	}
}
