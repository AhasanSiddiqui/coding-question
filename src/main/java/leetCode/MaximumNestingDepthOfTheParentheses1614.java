package com.ahasan.arraysdemo.leetCode;

public class MaximumNestingDepthOfTheParentheses1614 {
	public static void main(String[] args) {
		String input = "(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(input));

	}

	public static int maxDepth(String s) {
		if (s.length() == 1 | s.length() == 0)
			return 0;
		int max = 0;
		int innerDepth = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				innerDepth++;
			else if (s.charAt(i) == ')')
				innerDepth--;
			else
				continue;
			max = Math.max(max, innerDepth);
		}
		return max;
	}
}
