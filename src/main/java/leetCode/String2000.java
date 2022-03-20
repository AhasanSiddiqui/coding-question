package com.ahasan.arraysdemo.leetCode;

public class String2000 {
	public static void main(String[] args) {
		System.out.println(reversePrefix("abcdefd",'d'));
		System.out.println(reversePrefix2("abcdefd",'d'));

		System.out.println(Runtime.getRuntime().availableProcessors());

	}

	public static String reversePrefix2(String word,char ch) {
		int end = word.indexOf(ch);
		int length = word.length();

		// Get the prefix string and reverse it
		StringBuilder prefix = new StringBuilder(word.substring(0, end+1));
		prefix.reverse();

		// Get the part after prefix
		StringBuilder endPart = new StringBuilder(word.substring(end+1, length));

		// Just append the reversed prefix to the end part
		return prefix.append(endPart).toString();
	}

	public static String reversePrefix(String word, char ch) {
		boolean flag =false;
		int i;
		for (i=0;i<word.length();i++) {
			char ch1 =word.charAt(i);
			if(ch1==ch) {
				flag =true;
				break;
			}
		}

		if(!flag)
			return word;
		else {
			String firstHalf=word.substring(0,i+1);
			String secondtHalf=word.substring(i+1);
			return new StringBuilder(firstHalf).reverse().toString()+secondtHalf;
		}

	}

}
