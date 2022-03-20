package com.ahasan.arraysdemo.leetCode;

public class String848 {
	public static void main(String[] args) {
		String s = "abc";
		int []shifts = {3,5,9};
		System.out.println(shiftingLetters(s,shifts));
	}

	public static String shiftingLetters(String s, int[] shifts) {
		char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			ch[i]= (char) (ch[i]+shifts[i]);
		}
		return String.valueOf(ch);
	}
}
