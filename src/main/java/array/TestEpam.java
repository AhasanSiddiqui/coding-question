package com.ahasan.arraysdemo.array;

import java.util.Scanner;

public class TestEpam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value of the String : ");
		String userValue = scanner.next();
		if (userValue != null) {
			System.out.println(isPalindrom(userValue));
		} else {
			System.out.println("Please pass some valid String to test...");
		}
		
	}

	private static boolean isPalindrom(String userValue) {
		if (userValue.length() == 1) {
			return true;
		}
		char[] userCharacterArray = userValue.toCharArray();
		int count = 0;
		for (int i = userCharacterArray.length - 1; i > 0; i--) {
			userCharacterArray[count] = userCharacterArray[i];
			count++;
		}
		return new String(userCharacterArray).equals(userValue);
	}
}
