package com.ahasan.arraysdemo.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericTest {
	public static void main(String[] args) {
		List list=new ArrayList<String>();
		list.add("Ahasan");
		list.add(1);
		list.add(new Object());


		System.out.println(list);
	}

	/*public static void m1(List<String> list) {
		System.out.println(list);
	}*/ // Will clash because generics is applicable at compile time only


	public static void m1(List<Integer> list) {
		System.out.println(list);
	}
}
