package com.ahasan.arraysdemo.strings;

public class stringOnlyCotainsDigit {
	public static void main(String[] args) {
		String input="123q";
		System.out.println(isDigit(input));
		System.out.println(isDigit2(input));
		System.out.println(isDigit3(input));
	}

	private static boolean isDigit2(String input) {
		int count =0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)>='0' && input.charAt(i)<='9')
				count++;
		}
		return count==input.length()?true:false;
	}

	private static boolean isDigit(String input) {
		return input.matches("[0-9]+");
	}

	private static boolean isDigit3(String input) {
		int count =0;
		for (int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i)))
				count++;
		}
		return count==input.length()?true:false;
	}


}
