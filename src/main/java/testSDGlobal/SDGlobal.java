package com.ahasan.arraysdemo.testSDGlobal;

import java.util.ArrayList;
import java.util.List;

public class SDGlobal{
	public static void main(String[] args){
		String Input="My name , a Mohd Ahasan .";
		String Output="Ahasan Mohd , is name My .";
		//System.out.println(new StringBuilder(Input).reverse().toString());
		int count =0;
		List<String> stringList=new ArrayList<>();
		String[] strings=Input.split(" ");
		String[] result=new String[strings.length];

		for (int i=0; i < result.length; i++) {
			//int k=0;
			if(strings[i].length()==1){
				result[i]=strings[i];
				count++;
			}
		}


		for (int i=0; i < strings.length; i++) {

			if(!strings[strings.length-i-1].matches("azAZ")) {
				if(strings[strings.length-i-1].length()>1) {
					result[i] =strings[strings.length-i-1];
				}
			}

		}

		printArray(result);
	}

	private static void printArray(String[] strings){
		for (String str : strings) {
			System.out.println(str);
		}
	}
}
