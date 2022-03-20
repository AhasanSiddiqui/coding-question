package com.ahasan.arraysdemo.array;

import java.util.TreeMap;

class Solution {
	public static void main(String[] args) {
		int n = 5;
		int arr[] = {7 ,10, 4, 20, 15};
		int k = 4;
		int l = 0;
        System.out.println(kthSmallest(arr, l, n, k));
	}

	public static int kthSmallest(int[] arr, int l, int r, int k) {
		TreeMap<Integer, Integer> tmap = new TreeMap<>();
		for (l = 0; l < r; l++) {
		    tmap.put(arr[l],tmap.get(arr[l])==null ? 1 : tmap.get(arr[l]+1));
		}

		int count = 0;
		Integer result =0;
		for (Integer key : tmap.keySet()) {
			if (count == k-1) {
			    result=key;
				break;
			}
			count++;
		}
		return result;
	}
}
