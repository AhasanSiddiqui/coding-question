package com.ahasan.arraysdemo.strings;

public class StringRotation {
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		// s1 = ABCD, s2 = ACBD
		System.out.println(areRotations(str1, str2));
	}

	private static boolean areRotations(String str1, String str2) {
		String joinString=str1+str2;
		return (str1.length()==str2.length()) && (joinString.indexOf(str2)!=-1);
	}
}
