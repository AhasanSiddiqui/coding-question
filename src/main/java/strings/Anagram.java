package com.ahasan.arraysdemo.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) {
		String a="Ahasan";
		String b="haAsna";
		System.out.println(isAnagram(a,b));
	}

	public static boolean isAnagram(String a, String b) {
		Map<Character,Integer> map=new HashMap<>();

		for(Character character : a.toCharArray()) {
			if(map.containsKey(character)) {
				map.put(character,map.get(character)+1);
			} else {
				map.put(character,1);
			}
		}


		for(Character character : b.toCharArray()) {
			if(map.containsKey(character)) {
				map.put(character,map.get(character)-1);
			} else {
				map.put(character,1);
			}
		}

		for(Character character : map.keySet()) {
			if(map.get(character)!=0)
				return false;
		}
		return true;
	}
}
