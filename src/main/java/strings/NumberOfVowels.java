package com.ahasan.arraysdemo.strings;

import java.util.HashSet;
import java.util.Set;

public class NumberOfVowels{
	public static void main(String[] args){
		System.out.println(new NumberOfVowels().halvesAreAlike("textbook"));
	}

	public boolean halvesAreAlike(String s) {
		char []ch ={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		int half =s.length()/2;
		String firstHalf= s.substring(0,half);
		String secondHalf= s.substring(half);
		int count1=0;
		int count2=0;
		Set<Character> setOfVowels= new HashSet<>(ch.length);

		for (char c : ch) {
			setOfVowels.add(c);
		}

		for (char c : firstHalf.toCharArray()) {
			if(setOfVowels.contains(c)) {
				count1++;
			}
		}

		for (char c : secondHalf.toCharArray()) {
			if(setOfVowels.contains(c)) {
				count2++;
			}
		}
		if(count1==count2)
			return true;
		return false;

	}
}
