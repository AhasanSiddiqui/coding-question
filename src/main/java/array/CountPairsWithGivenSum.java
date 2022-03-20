package com.ahasan.arraysdemo.array;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int sum = 6;
		getPairsCount(arr,sum);
	}
	public  static int getPairsCount(int[] arr, int sum) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int ele: arr) {
			map.put(ele,map.get(ele)==null? 1 : map.get(ele)+1);
		}

		for(Integer key : map.keySet()) {
			if(key+map.get(key) ==sum)
				System.out.println(key+" : "+map.get(key));
		}
		return 0;
	}
}
