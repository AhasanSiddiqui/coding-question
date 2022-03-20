package com.ahasan.arraysdemo.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortAsOccurance {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 3, 1, 3, 2, 4};
		sortArrayAsPerElements(arr);
		printArrayElements(arr);
	}

	private static int[] sortArrayAsPerElements(int[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.get(arr[i]) == null ? 1 : map.get(arr[i]) + 1);
		}
		int i = 0;
		for (int ele : map.keySet()) {
			for (; i < map.get(ele); i++) {
				arr[i] = ele;
			}
		}

		printArrayElements(arr);
		return arr;
	}

	private static void printArrayElements(int[] arr) {
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
