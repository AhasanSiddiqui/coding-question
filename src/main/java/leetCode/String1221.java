package com.ahasan.arraysdemo.leetCode;

public class String1221 {
	public static void main(String[] args) {
		System.out.println(balancedStringSplit("RLRRLLRLRL"));
	}

	public static int balancedStringSplit(String s) {
		int r = 0;
		int l = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (a == 'R') {
				r++;
			}
			if (a == 'L') {
				l++;
			}
			if (r == l) {
				count++;
			}
		}
		return count;
	}
}
