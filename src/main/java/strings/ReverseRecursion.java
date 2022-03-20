package com.ahasan.arraysdemo.strings;

import org.springframework.util.StringUtils;

public class ReverseRecursion {
	public static void main(String[] args) {
		String str="ahasan";
		System.out.println(reverse(str));
	}

	private static String reverse(String str) {
		if(str.length()<=1 || str==null)
			return str;
		else {
			return  reverse(str.substring(1))+str.charAt(0);
		}
	}
}
