package com.ahasan.arraysdemo.java8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ByteProgramming {
	public static void main(String[] args) {

		Map map=new HashMap();
		map.put(1,"Ahasan");
		map.put(1,"Siddiqui");
		System.out.println(map.get(1));

		Map hashtable=new Hashtable();
		//hashtable.put("A",null);

		Map map1=new ConcurrentHashMap() ;
		//map1.put("A",null);

		System.out.println(null==null);


		//System.out.println(hashtable);
		ByteProgramming byteProgramming=new ByteProgramming();
		//byteProgramming.m1(new ByteProgramming());

	}

	public void m1(String s) {
		System.out.println("String m1");
	}

	public void m1(int num) {
		System.out.println("int m1");
	}
}
