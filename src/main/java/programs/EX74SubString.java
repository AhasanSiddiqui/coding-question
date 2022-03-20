package com.ahasan.arraysdemo.programs;

public class EX74SubString {
	public static void main(String[] args) {
		String str = "Mix Pattern";
		String st = str.substring(1, 3);
		boolean output;
		if (st.equals("ix"))
			output = true;
		else
			output = false;
		System.out.println(output);
	}
}
