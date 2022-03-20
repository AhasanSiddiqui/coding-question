package com.ahasan.arraysdemo.leetCode;

public class String541{
	public static void main(String[] args){
		System.out.println(reverseStr("abcdefg" ,2));
	}

	public static String reverseStr(String s ,int k){
		return new StringBuilder(s.substring(0 ,k)).reverse().toString() + s.substring(k);
	}
}
