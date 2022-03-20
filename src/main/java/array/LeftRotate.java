package com.ahasan.arraysdemo.array;

public class LeftRotate {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		int n = 7;
		int d = 2;
		leftRotate(ar, d, n);
		print(ar);
	}

	private static void leftRotate(int[] ar, int d, int n) {
		d = d % n;
		reveseArray(ar, 0, d - 1);
		reveseArray(ar, d, n - 1);
		reveseArray(ar, 0, n - 1);

	}

	private static void reveseArray(int[] ar, int start, int end) {
		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
	}

	private static void print(int[] arr) {
		for (int ar : arr) {
			System.out.print(ar + "\t");
		}
	}
}
