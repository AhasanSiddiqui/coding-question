package com.ahasan.arraysdemo.strings;

public class SuffledSentenced {
	public static void main(String[] args) {
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
	}

	public static String sortSentence(String s) {
		String []str= s.split(" ");
		String result="";
		String []strResult=new String[str.length];
		for(int i=0;i<str.length;i++) {
			int initialIndex=str[i].length()-1;
			int endIndex=str[i].length();
			int index=Integer.parseInt(str[i].substring(initialIndex,endIndex))-1;
			strResult[index]=str[i].substring(0,str[i].length()-1);
		}
		int i=0;
		for (i=0;i<strResult.length-1;i++)
			result=result+strResult[i]+" ";
		result = result+strResult[i];
		return result;
	}
}
