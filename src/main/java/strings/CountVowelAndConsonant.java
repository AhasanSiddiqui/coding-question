package com.ahasan.arraysdemo.strings;

public class CountVowelAndConsonant {
	public static void main(String[] args) {
		String input="ahasansiddiqui";

		count(input);
	}

	private static void count(String input) {

		String inputForCheck = input.toLowerCase();
		String vowels ="aeiou";
		int countVowels=0;
		int countConsonants=0;
		for (int i = 0; i < input.length(); i++) {
			if(inputForCheck.charAt(i)>='a' && inputForCheck.charAt(i) <='z') {
				if(vowels.indexOf(inputForCheck.charAt(i))!=-1) {
					countVowels++;
				} else
					countConsonants++;
			}
		}
		System.out.println(countVowels);
		System.out.println(countConsonants);
	}
}
