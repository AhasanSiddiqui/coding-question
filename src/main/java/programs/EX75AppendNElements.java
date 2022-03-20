package com.ahasan.arraysdemo.programs;

public class EX75AppendNElements {
	public static void main(String args[]) {
		String input = "HelloWorld";
		int input2 = 2;
		String output;

		output = "" + input.charAt(0);
		for (int i = 1; i < input.length(); i = i + input2) {
			output = output + input.charAt(i);
		}
		System.out.println(output);

	}
}
