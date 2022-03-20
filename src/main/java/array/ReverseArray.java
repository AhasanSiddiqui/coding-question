package com.ahasan.arraysdemo.array;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		reverseArray(arr);
		printArrayElements(arr);
	}

	private static void reverseArray(int[] arr) {
		int start=0;
		int end = arr.length-1;
		while (start<end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	private static void printArrayElements(int[] arr) {
		for (int element : arr) {
			System.out.println(element);
		}
	}

	private static void swap(int[] arr, int start, int end) {
		int temp= arr[end];
		arr[end]= arr[start];
		arr[start]=temp;
	}
}
