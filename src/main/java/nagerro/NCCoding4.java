package com.ahasan.arraysdemo.nagerro;

import java.util.ArrayList;
import java.util.List;

/*
* Q3. Find the longest palendrom in a string?
Example
Input: abfgerccdedccfgfer
Output: ccdedcc*/
public class NCCoding4{
	public static void main(String[] args){
		longestPalindrome("abfgerccdedccfgfer");
	}

	private static void longestPalindrome(String ss){
		List<String>stringList=new ArrayList<>();
		for (int i=0; i <ss.length() ; i++) {
			for (int j=i+1; j < ss.length(); j++) {
				String substring=ss.substring(j ,ss.length());
				if(substring.length()>1){
					if(new StringBuilder(substring).reverse().toString().equals(substring)){
						stringList.add(substring);
					}
				}
			}
		}
		System.out.println(stringList);
	}
}
