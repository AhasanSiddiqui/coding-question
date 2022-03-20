package com.ahasan.arraysdemo.leetCode;

import javax.xml.stream.events.Characters;

public class String796{
	public static void main(String[] args){
		rotateString("abcde" ,
				"cdeab");
	}

	public static boolean rotateString(String s ,String goal){
		for (int i=0; i < s.length() - 1; i++) {
			String temp=s;
			String s1=temp.substring(i + 1) + temp.substring(0,i+1);
			if(s1.equals(goal)){
				return true;
			}
		}
		return false;
	}
}
