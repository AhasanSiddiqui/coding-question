package com.ahasan.arraysdemo.array;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		BubbleSort.sort(array);
		for (int ele : array)
			System.out.print(ele+"\t");
	}

	private static void sort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=i;j<array.length-1-i;j++) {
				if(array[j]>array[j+1])
					swap(array,j,j+1);
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp =array[i];
		array[i]=array[j];
		array[j]=temp;
	}


}
