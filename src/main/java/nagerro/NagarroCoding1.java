package com.ahasan.arraysdemo.nagerro;

import java.util.HashMap;
import java.util.Map;

/*
Q1. Input an array and then print the repeating characters??
Example:
Input:1,3,23,11,44,3,23,2,3.
Output:3,23
* */
public class NagarroCoding1{
	public static void main(String[] args){
		int[] arr={1 ,3 ,23 ,11 ,44 ,3 ,23 ,2 ,3};
		printRepeating(arr);

	}

	private static void printRepeating(int[] arr){
		Map<Integer,Integer> integerMap=new HashMap<>();
		for (int i=0; i < arr.length; i++) {
			if (integerMap.containsKey(arr[i])) {
				integerMap.put(arr[i] ,integerMap.get(arr[i]) + 1);
			} else {
				integerMap.put(arr[i] ,1);
			}
		}

		for (Integer val : integerMap.keySet()) {
			if (integerMap.get(val) > 1)
				System.out.println(val);
		}
	}
}
