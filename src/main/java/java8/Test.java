package com.ahasan.arraysdemo.java8;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Test{

	private String id;

	public Test(String id){
		this.id=id;
	}

	public static void main(String[] args){
		String s1="abc";
		Map<String,String> stringStringMap=new HashMap<>();
		stringStringMap.put(s1,"111");
		s1="xyz";
		System.out.println(stringStringMap);
		Test test=new Test("11");
		Map<Test,String> testMap=new HashMap<>();
		testMap.put(test,"11");
		test=new Test("22222");

		System.out.println(testMap);


	}
}

