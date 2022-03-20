/**
 * HashMap<String,Integer> h1={�abc�:50,�efg�:70};
 * if the mark is less than 60 then put the output is the
 * HashMap<String,String> h2={�abc�:�fail�,�efg�:�pass�} * 
 */

package com.ahasan.arraysdemo.programs;

import java.util.HashMap;
import java.util.Map;

public class EX46CompareValuesInHashMap {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("abc", 50);
		map1.put("efg", 70);
		System.out.println(map1);

		Map<String, String> map2 = new HashMap<String, String>();

		for (String i : map1.keySet()) {
			if (map1.get(i) > 60) {
				map2.put(i, "pass");
			} else {
				map2.put(i, "fail");
			}
		}

		System.out.println(map2);

	}
}
