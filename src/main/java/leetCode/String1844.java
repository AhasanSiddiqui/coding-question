package com.ahasan.arraysdemo.leetCode;

public class String1844 {
	public static void main(String[] args) {
		System.out.println(replaceDigits("a1c1e1"));
		System.out.println(replaceDigits("a1c1e1"));
	}

	public static String replaceDigits2(String s) {
		char[] ch = s.toCharArray();
		for (int i = 1; i < ch.length; i=i+2) {
			ch[i] = (char) (ch[i-1]+ch[i]-'0');
		}
		return String.valueOf(ch);
	}

		public static String replaceDigits(String s) {
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (i % 2 != 0) {
				ch[i] = shift(ch[i], ch[i - 1]);
			}
		}
		return String.valueOf(ch);
	}

	public static char shift(char ch1, char ch2) {
		return (char) (ch2 + ch1 - '0');
	}
}
