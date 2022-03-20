package com.ahasan.arraysdemo.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest{
	public static void main(String[] args){
		Set set=new TreeSet<>();
		set.add(new StringBuffer("A"));
		set.add(new StringBuffer("b"));
		set.add(new StringBuffer("D"));
		set.add(new StringBuffer("F"));
		set.add(new StringBuffer("C"));
		set.add(new StringBuffer("a"));
		set.add("a");
		System.out.println(set);
		set.stream().forEach(System.out::println);
	}
}
