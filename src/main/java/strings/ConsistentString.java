package com.ahasan.arraysdemo.strings;

import java.util.HashSet;
import java.util.Set;

public class ConsistentString {
	public static void main(String[] args) {
		String []words= new String[]{"ad", "bd", "aaab", "baa", "badab"};
		String allowed="ab";
		countConsistentStrings(allowed,words);
	}

	public static int countConsistentStrings(String allowed, String[] words) {
		Set<String> allowedSet = new HashSet<>();

		for (int i=0;i<allowed.length();i++){
			allowedSet.add(allowed.substring(i,i+1));
		}

		int result =0;
		int count =0;
		for (int i=0;i<words.length;i++){
			count =0;
			for (int j=0;j<words[i].length();j++){
				String subStr=words[i].substring(j,j+1);
				if(allowedSet.contains(subStr)){
					count++;
				}
				if(allowedSet.size()==count)
					result++;
			}
		}

		return result;
	}
}
