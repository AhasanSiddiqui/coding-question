package com.ahasan.arraysdemo.array;

import java.util.ArrayList;
import java.util.List;

public class Epam {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 3, 7, 0, 4};

		//{1,2,4,3,7,4,0}
		findNewArrayWithZeorAtTheEnd(arr);
	}

	private static void findNewArrayWithZeorAtTheEnd(int[] arr) {
		List<Integer> integers = new ArrayList<>();
		int count =0;
		for (int a : arr) {
			if(a!=0) {
				integers.add(a);
			} else{
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			integers.add(0);
		}
		System.out.println(integers);
	}
}
