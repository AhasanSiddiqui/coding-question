package com.ahasan.arraysdemo.array;

public class SortArrayOf0s1sAnd2s {
	public static void main(String[] args) {
		int ar[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int n = 12;
		sort012(ar, n);
		printArray(ar);
	}

	private static void printArray(int[] ar) {
		for (int element : ar)
			System.out.print(element + "\t");
	}

	private static void sort012(int[] ar, int n) {
		int zero = 0;
		int one = 0;
		int two = 0;
		for (int i = 0; i < n; i++) {
			switch (ar[i]) {
				case 0: {
					zero++;
					break;
				}
				case 1: {
					one++;
					break;
				}
				case 2: {
					two++;
					break;
				}
			}
		}

		int count = 0;
		while (zero > 0) {
			ar[count++] = 0;
			zero--;
		}

		while (one > 0) {
			ar[count++] = 1;
			one--;
		}

		while (two > 0) {
			ar[count++] = 2;
			two--;
		}
	}
}

