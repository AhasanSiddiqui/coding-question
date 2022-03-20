package com.ahasan.arraysdemo.strings;

public class ReverseString {
	public static void main(String[] args) {
		char []ch = {'h','e','l','l','o'};
		reverseString(ch);
	}

	public static void reverseString(char[] s) {
		char []rs = new char[s.length];
		for (int i=0;i<s.length;i++){
			int index=s.length-1-i;
			rs[i]=s[index];
			System.out.print(rs[i]);
		}

	}
}
