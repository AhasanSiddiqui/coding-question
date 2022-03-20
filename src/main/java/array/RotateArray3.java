package com.ahasan.arraysdemo.array;

public class RotateArray3 {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = 9;
		int d = 4;
		rotate(ar, d, n);
		print(ar);
	}

	private static void rotate(int[] ar, int d, int n) {
		for (int i = 0; i < d; i++) {
			leftRotateByOne(ar, n);
		}
	}

	private static void leftRotateByOne(int[] ar, int n) {
		int temp = ar[0];
		int k = 0;
		for (k = 0; k < n - 1; k++)
			ar[k] = ar[k + 1];
		ar[k] = temp;
	}


	private static void print(int[] arr) {
		for (int ar : arr) {
			System.out.print(ar + "\t");
		}
	}
}
