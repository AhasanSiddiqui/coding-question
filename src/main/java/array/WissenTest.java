package com.ahasan.arraysdemo.array;

import java.util.List;

public class WissenTest {
	public static void main(String[] args) {
		String input ="test";
		// abc --  acb -- bca -- bac -- cab -- aba

		findAllString(input);
	}

	private static void findAllString(String input) {
		String result="";
		for (int i = 0; i <input.length() ; i++) {
			for (int j = i+1; j < input.length(); j++) {
				 result =result+input.charAt(i)+""+input.substring(j) + " : ";
			}
		}
	}
}
