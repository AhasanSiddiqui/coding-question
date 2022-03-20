package com.ahasan.arraysdemo.leetCode;

public class String917 {
	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
	}

	public static String reverseOnlyLetters(String S) {
		char[] charArr = S.toCharArray();
		if(charArr.length == 0 || charArr.length == 1)
			return String.valueOf(charArr);

		int i=0, j=charArr.length-1;

		while(i<j) {
			if(!Character.isLetter(charArr[i])){
				i++;
			} else if(!Character.isLetter(charArr[j])) {
				j--;
			} else {
				char temp=charArr[i];
				charArr[i]=charArr[j];
				charArr[j]=temp;
				i++;
				j--;
			}
		}

		return String.valueOf(charArr);
	}
}
