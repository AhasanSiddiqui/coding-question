package com.ahasan.arraysdemo.array;// Java program to sort an array of 0, 1 and 2

class countzot {

	// Sort the input array, the array is assumed to
	// have values in {0, 1, 2}
	static void sort012(int a[], int arr_size) {
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
				case 0: {
					swap(a, lo, mid);
					lo++;
					mid++;
					break;
				}
				case 1:
					mid++;
					break;
				case 2: {
					swap(a, mid, hi);
					hi--;
					break;
				}
			}
		}
	}

	private static void swap(int[] a, int lo, int mid) {
		int temp;
		temp = a[lo];
		a[lo] = a[mid];
		a[mid] = temp;
	}

	/* Utility function to print array arr[] */
	static void printArray(int arr[], int arr_size) {
		for (int i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " \t");
	}

	/*Driver function to check for above functions*/
	public static void main(String[] args) {
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int arr_size = arr.length;
		sort012(arr, arr_size);
		System.out.println("Array after seggregation ");
		printArray(arr, arr_size);
	}
}

