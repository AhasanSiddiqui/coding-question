package com.ahasan.arraysdemo.java8;

public class ZeroOne{

	public static void main(String[] args){
		int[] arr={1 ,1 ,1 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,0};


		//List<Integer> integers=new ArrayList<>();


		int count=0;
		for (int aa : arr) {
			if (aa == 1) {
				//integers.add(aa);
				arr[count]=aa;
				count++;
			}
		}

		for (int aa : arr) {
			if (aa == 0) {
				arr[count]=aa;
				count++;
			}
		}
		//System.out.println(integers);

		printArray(arr);
	}

	private static void printArray(int[] arr){

	}
}
