package com.ahasan.arraysdemo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestProgram {
	public static void main(String[] args) {
		int[] arr = {5, 7, -3, -8, 1, -2, 9};
		//sortArray(arr);
		sortArrayInMemory(arr);
	}

	private static void sortArrayInMemory(int[] arr) {
		int j = 0;
		int position =0;
		//int[] arr = {5, 7, -3, -8, 1, -2, 9};
		//int min =findPositiveSmallestElement(arr);
		int min =Integer.MAX_VALUE;
		int count =0;
		/*for (int a:arr) {
			if(min>0 & min < a) {
				min =a;
				count++;
			}
		}
*/
		for (int i = 0; i < count; i++) {
			if(arr[i] > 0) {
				arr[i] = arr[i];
			} else {
				swap(arr,i,arr.length-1);
			}
		}

		printArray(arr);
	}

	private static void swap(int[] arr, int i, int length) {
		int temp =arr[i];
		arr[i]=length;
		length=temp;
	}

	private static int  findPositiveSmallestElement(int[] arr) {

		int min =Integer.MAX_VALUE;
		int count =0;
		for (int a:arr) {
			if(min>0 & min < a) {
				min =a;
				count++;
			}
		}
		return Arrays.stream(arr).filter(a->a>0).min().getAsInt();
	}

	private static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.println(element);
		}
	}

	private static void sortArray(int[] arr) {
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				integers.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				integers.add(arr[i]);
		}

		integers.forEach(System.out::println);
	}
}
