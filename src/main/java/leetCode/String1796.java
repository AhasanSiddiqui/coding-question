package com.ahasan.arraysdemo.leetCode;

import java.util.HashSet;
import java.util.Set;

public class String1796{
	public static void main(String[] args){
		String s = "dfa12321afd";
		new String1796().secondHighest(s);
	}

	public void secondHighest(String str) {
		Set<Integer> integers=new HashSet<>();
		for (int i=0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				integers.add(str.charAt(i)-'0');
			}
		}

		System.out.println(integers);
	}
}
