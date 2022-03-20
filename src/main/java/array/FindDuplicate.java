package com.ahasan.arraysdemo.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicate {
	public static void main(String[] args) {
		int n = 7;
		int[] arr =  {1, 6, 3, 1, 3, 6, 6};
		System.out.println(duplicates(arr, 7));
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int ele : arr) {
			map.put(ele, map.get(ele) == null ? 1 : map.get(ele) + 1);
		}

		ArrayList<Integer> result = new ArrayList<>();

		for (Integer key : map.keySet()) {
			if (map.get(key) > 1)
				result.add(key);
		}

		if (result.size() == 0) {
			result.add(-1);
			return result;
		}
		return result;
	}
}
