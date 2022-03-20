package com.ahasan.arraysdemo.array;

import java.util.HashMap;
import java.util.Map;

public class WellsFargo {
	public static void main(String[] args) {
		String str = "[[]{(}])";  //"[{(})]";
		System.out.println(isBalance(str));
	}

	private static boolean isBalance(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.get(str.charAt(i)) == null ? 1 : map.get(str.charAt(i)) + 1);
		}

		System.out.println(map);
		for (Character character: map.keySet()) {

			if(map.get(character)-1!=0) {
				return false;
			}
		}
		return true;
	}
}
