package com.ahasan.arraysdemo.array;

import java.util.Locale;

public class Naggaro {
	public static void main(String[] args) {
		System.out.println(transform("i love programming"));
	}
	public static  String transform(String s)
	{
		String res="";
		String []rs =s.split(" ");
		for(String str: rs)
			res += str.substring(0,1).toUpperCase()+str.substring(1)+" ";
		return res;
	}
}
