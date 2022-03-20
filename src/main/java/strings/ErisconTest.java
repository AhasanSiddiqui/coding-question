package com.ahasan.arraysdemo.strings;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ErisconTest{

	public static void main(String[] args) {
		List<String> stringList=new CopyOnWriteArrayList<String>();//15  1.75 //37
		List<String> copyOnWriteArrayList=new CopyOnWriteArrayList<String>();//15  1.75 //37

		stringList.add("A");
		stringList.add("E");
		stringList.add("B");
		stringList.add("A");

		Iterator<String> iterator = stringList.iterator();

		while (iterator.hasNext()) {
			stringList.remove("A");
			System.out.println(iterator.next());
		}
	}


}
