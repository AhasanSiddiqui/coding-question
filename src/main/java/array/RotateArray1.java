package com.ahasan.arraysdemo.array;

public class RotateArray1 {
	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = 9;
		int d = 2;
		rotate(ar, d, n);
		print(ar);
	}

	private static void rotate(int[] ar, int d, int n) {
		int[] temp = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = ar[i];
		}

		for (int i = 0; i < n - d; i++) {
			ar[i] = ar[i + d];
		}

		for (int i = n - d, j = 0; i < n & j < d; i++, j++) {
			ar[i] = temp[j];
		}

	}

	private static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	private static void print(int[] arr) {
		for (int ar : arr) {
			System.out.print(ar + "\t");
		}
	}
}
