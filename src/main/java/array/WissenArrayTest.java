package com.ahasan.arraysdemo.array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WissenArrayTest {

	public static void main(String[] args) {
		int arr [] ={1,22,13,4,5,3};
		int diff = 9;
		findPairs(arr,diff);

		String str ="my name is mohd ahsaan siddiqui and i am working in wissen technology";
	}

	private static void findPairs(int[] arr, int diff) {
		Set<Integer> integers=new HashSet<>();

		for (int ele: arr) {
			integers.add(ele);
		}

		for (int i = 0; i < arr.length; i++) {

		}



		for (int i = 0; i <arr.length ; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==diff) {
					System.out.println(arr[i] + " : "+ arr[j]);
				}
			}
		}
	}
}
