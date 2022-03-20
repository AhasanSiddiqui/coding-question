package com.ahasan.arraysdemo.java8;

public class StringDemo{
	public static void main(String[] args){
		//System.out.println(countValidWords("he bought 2 pencils, 3 erasers, and 1  pencil-sharpener."));
		System.out.println(isPalindrome("0P"));
	}

	public static int countValidWords(String sentence) {
		int count =0;
		String []str=sentence.split(" ");

		for (String ss:str) {
			if(ss.matches("[a-z]+")) {
				count++;
				continue;
			}

			if(ss.equals("") || ss.charAt(0)=='-' || ss.charAt(0)=='!' || ss.charAt(ss.length()-1)=='-'){

				continue;
			}
		}
		return count;
	}

	public boolean validPalindrome(String s) {
		if(s.length()==1)
			return true;
		if(s.length()==2 && s.substring(0,1).equals(s.substring(1)))
			return true;
		return false;
	}

	public static boolean isPalindrome(String s) {
		if (s=="")
			return true;
		String str=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
		return new StringBuilder(str)
				.reverse().toString().equals(str);

	}
}
