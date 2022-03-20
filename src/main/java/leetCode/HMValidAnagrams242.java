package com.ahasan.arraysdemo.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HMValidAnagrams242{
	public static void main(String[] args){
		isAnagram("anagram","nagaram");
	}

	public static boolean isAnagram(String s, String t) {
		List<String> ss=new ArrayList<>();
		int count =0;
		if(s.length() > t.length() || s.length() < t.length())
			return false;

		for(int i=0;i<s.length();i++) {
			ss.add(s.substring(i,i+1));
		}

		for(int i=0;i<t.length();i++) {
			if(ss.contains(t.substring(i,i+1))) {
				count++;
			}
		}

		return count==s.length()?true:false;
	}
}
