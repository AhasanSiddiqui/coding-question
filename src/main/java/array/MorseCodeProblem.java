package com.ahasan.arraysdemo.array;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeProblem {
	public static void main(String[] args) {
		String input = "CAT";
		findMorseCode(input);
	}

	private static void findMorseCode(String str) {

		String[] arr = {"*-", "-***", "-*-*", "-**", "**-*", "*", "--*", "****", "**", "*---", "-*-", "*-**",
				"--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**"};
		Map<String, String> morsheCodeMap = new HashMap<>();

		for (int i = 65,j=0; i < 91 & j<arr.length; i++,j++) {
			char ch = (char) i;
			morsheCodeMap.put(ch + "", arr[j]);
		}

		String inputMarchCode= convertMorseCode(str,morsheCodeMap);

		String s = convertMorseCodeToAnotherLetter(inputMarchCode, morsheCodeMap);
		//System.out.println(inputMarchCode);
		//printMap(morsheCodeMap);
		System.out.println(s);
	}

	private static String convertMorseCodeToAnotherLetter(String inputMarchCode, Map<String, String> morsheCodeMap) {

		String outputLetter="";
		int j=1;
		for (int i = 0; i < inputMarchCode.length(); i++) {
			String ss= inputMarchCode.substring(0,j);
			if(morsheCodeMap.containsValue(ss)){
				for (String key : morsheCodeMap.keySet()) {
					if(morsheCodeMap.get(key).equals(ss)) {
						outputLetter+=key;
					}
				}
			}
			j++;
			if(j>4) {
				j=0;
			}
		}
		return outputLetter;
	}

	private static String convertMorseCode(String str,Map<String, String> morsheCodeMap) {
		String marchCode ="";
		for (int i = 0; i <str.length() ; i++) {
			marchCode+=morsheCodeMap.get(str.charAt(i)+"");
		}
		return  marchCode;
	}

	private static void printMap(Map<String, String> morsheCodeMap) {
		morsheCodeMap.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
