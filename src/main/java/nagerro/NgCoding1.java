package com.ahasan.arraysdemo.nagerro;

import java.util.Locale;

public class NgCoding1{
	public static void main(String[] args){
		capitalize("my_first_variable");
	}

	private static void capitalize(String str){
		String ss[]=str.split("_");
		String result="";
		for (String s: ss) {
			result=result+s.substring(0,1).toUpperCase()+s.substring(1);
		}
		System.out.println(result);
	}
}
