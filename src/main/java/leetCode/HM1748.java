package com.ahasan.arraysdemo.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HM1748{
	public static void main(String[] args){

	}

	public int sumOfUnique(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i],map.get(nums[i])+1);
			} else{
				map.put(nums[i],1);
			}
		}

		return map.values().size()==1?0:map.values().stream().reduce(0,Integer::sum);
	}
}
