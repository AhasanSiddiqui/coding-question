package com.ahasan.arraysdemo.strings;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static void main(String[] args) {
		String str="Ahasan";
		System.out.println(reverse(str));
	}

	private static String reverse(String str) {
		Stack<Character> characters=new Stack<>();
		StringBuilder result=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			characters.push(str.charAt(i));
		}
		while (!characters.isEmpty()){
			result.append(characters.pop());
		}
		return result.toString();
	}
}
