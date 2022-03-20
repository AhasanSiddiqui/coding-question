package com.ahasan.arraysdemo.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HM1207{

	public static void main(String[] args){
		uniqueOccurrences(new int[]{1,2});
	}

	public static boolean uniqueOccurrences(int[] arr) {
		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			} else {
				map.put(arr[i],1);
			}
		}
		return new HashSet<>(map.values()).size()<map.values().size() ? false :true;
	}
}
