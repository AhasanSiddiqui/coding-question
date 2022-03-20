package com.ahasan.arraysdemo.strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String name = "ahasansiddiqui";
		duplicateCharacterRemoval(name);
	}

	private static void duplicateCharacterRemoval(String name) {

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (result.indexOf(ch+"") < 0) {
				result.append(ch);
			}
		}
		System.out.println(result);
	}
}
