package com.ahasan.arraysdemo.leetCode;

import java.util.ArrayList;
import java.util.List;

public class HM389{
	public static void main(String[] args){
		System.out.println(findTheDifference("abcd", "abcde"));
		System.out.println(Math.sqrt(-4));
	}

	public static char findTheDifference(String s, String t) {
		char ch ='a';
		List<Character> list=new ArrayList<>();

		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}

		for(int i=0;i<t.length();i++) {
			if(!list.contains(t.charAt(i))){
				return t.charAt(i);
			}
		}
		return ch;
	}
}
