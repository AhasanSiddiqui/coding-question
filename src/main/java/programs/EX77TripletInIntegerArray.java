package com.ahasan.arraysdemo.programs;

public class EX77TripletInIntegerArray {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 2, 3, 3, 4, 4, 5 };
		boolean output = false;
		for (int i = 0; i < input.length - 2; i++) {
			if (input[i] == input[i + 1] && input[i] == input[i + 2]) {
				output = true;
			}
		}

		System.out.println(output);

	}

}
