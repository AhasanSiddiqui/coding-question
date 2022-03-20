package com.ahasan.arraysdemo.array;

import java.util.HashMap;
import java.util.Map;

//Minimum Delete Operations to make all Elements of Array Same
public class MinimumDelete {
	public static void main(String[] args) {
		int [] arr ={1, 1, 4, 6, 2, 1};

		Map<Integer,Integer> map=new HashMap<>();
		int maxFrequency=Integer.MIN_VALUE;
		maxFrequency = getMaxFrequency(arr, map, maxFrequency);
		System.out.println(maxFrequency);
		printMap(map);
	}

	private static int getMaxFrequency(int[] arr, Map<Integer, Integer> map, int maxFrequency) {
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.get(arr[i])==null ? 1 : map.get(arr[i])+1);
		}
		for (Integer integer: map.keySet()) {
			maxFrequency =Math.max(maxFrequency, map.get(integer));
		}
		return maxFrequency;
	}

	private static void printMap(Map<Integer, Integer> map) {
		for (Integer key: map.keySet()) {
			System.out.println(key+" "+ map.get(key));
		}
	}
}
