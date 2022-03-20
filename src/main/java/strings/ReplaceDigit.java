package com.ahasan.arraysdemo.strings;

public class ReplaceDigit {

	public static void main(String[] args) {
		System.out.println(replaceDigits("a1b2c3d4e"));
	}

	public static String replaceDigits(String s) {
		char []ch = s.toCharArray();
		String rs="";
		for (int i=0;i<ch.length-1;i=i+2) {
			char ch1=ch[i];
			int ch2=Integer.valueOf(ch[i+1]+"");
			char ch3 =(char)(ch1+ch2);
			rs+=""+ch3;
		}
		return rs;
	}
}
