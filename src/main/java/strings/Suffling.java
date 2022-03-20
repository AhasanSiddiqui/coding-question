package com.ahasan.arraysdemo.strings;

public class Suffling {

	public static void main(String[] args) {
		System.out.println(restoreString("codeleet",new int []{4,5,6,7,0,2,1,3}));
		System.out.println(15%3);
	}

	public static  String restoreString(String s, int[] indices) {
		String result="";
		for(int i=0;i<indices.length;i++){
			int index=indices[i];
			result +=s.substring(index,index+1);
		}
		return result;
	}
}
