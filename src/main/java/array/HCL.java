package com.ahasan.arraysdemo.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HCL {
	public static void main(String[] args) {
		System.out.println(Arrays.asList(1,2,3,4,5).stream().reduce(Integer::sum));

		String str ="Ahasan";
		System.out.println(firstNonRepeatedCharacter(str));
	}

	private static String firstNonRepeatedCharacter(String str) {
		Map<Character,Integer> map=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i),map.get(str.charAt(i))==null ?1 : map.get(str.charAt(i))+1);
		}

		for (Character ch: map.keySet()) {
			if(map.get(ch)==1) {
				return Character.toString(ch);
			}
		}
		return null;
	}
}
