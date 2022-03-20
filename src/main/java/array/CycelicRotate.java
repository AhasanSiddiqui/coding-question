package com.ahasan.arraysdemo.array;

public class CycelicRotate {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5};
		int n = 5;
		cyclicRotateArray(ar, n);
		print(ar);
	}

	private static void cyclicRotateArray(int[] ar, int n) {
		int temp = ar[n - 1];
		for (int i = 0; i < n - 1; i++)
			ar[n - i - 1] = ar[n - i - 2];
		ar[0] = temp;
	}


	private static void print(int[] arr) {
		for (int ar : arr) {
			System.out.print(ar + "\t");
		}
	}
}
