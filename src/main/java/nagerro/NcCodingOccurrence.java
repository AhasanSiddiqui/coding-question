package com.ahasan.arraysdemo.nagerro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NcCodingOccurrence{
	public static void main(String[] args){
		occurrence("aaabcccfffghh");//a3b1c3f3g1h2 a3b1c3f3g1h2
	}

	private static void occurrence(String ss){
		Map<Character,Integer> integerMap=new HashMap<>();

		for (int i=0; i < ss.length(); i++) {
			if(integerMap.containsKey(ss.charAt(i))){
				integerMap.put(ss.charAt(i),integerMap.get(ss.charAt(i))+1);
			} else{
				integerMap.put(ss.charAt(i),1);
			}
		}
		//integerMap.entrySet().stream().collect(Collectors.toList());
		List<Integer> integers= new ArrayList<>(integerMap.values());
		String result="";
		for (Character s: integerMap.keySet()) {
			result=result+s+integerMap.get(s);
		}

		System.out.println(result);
	}
}
