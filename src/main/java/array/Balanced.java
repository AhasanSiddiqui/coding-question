package com.ahasan.arraysdemo.array;

import java.util.HashMap;
import java.util.Map;

public class Balanced {
	public static void main(String[] args) {
		System.out.println(findBalance("[()]{}{[()()]()}"));
	}

	public static String findBalance(String str) {
		Map<String, Integer> forestSpecies = new HashMap<>();

		forestSpecies.put("Amazon", 30000);
		forestSpecies.put("Congo", 10000);
		forestSpecies.put("Daintree", 15000);
		forestSpecies.put("Amazon", 40000);

		int forestCount = forestSpecies.size();
		System.out.println(forestCount);
		Map<Character, Integer> map = new HashMap<>();
		char []ch =str.toCharArray();
		for (Character ele : ch) {
			map.put(ele, map.get(ele) == null ? 1 : map.get(ele) + 1);
			//map.put(ele, map.get(ele)==null ? 1 : map.get(ele)+1) ;
		}

		for (Character key : map.keySet()) {
			System.out.println(key +" : "+map.get(key));
			if (map.get(key) % 2!=0)
				return "Not Balanced";
		}
		return "Balanced";
	}
}
