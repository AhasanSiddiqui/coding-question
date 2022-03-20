package com.ahasan.arraysdemo.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {
	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		List<Integer> integerList=new ArrayList<>();
		List<Double> doubleList=new ArrayList<>();
		showList(stringList);
		showList(integerList);
		showList(doubleList);

		//showList2(stringList); // Bounded type in wild Card
		showList2(integerList);
		showList2(doubleList);


		List<Number> numberList=new ArrayList<>();
		List<Object> objectList=new ArrayList<>();
		showList3(numberList);
		showList3(objectList);
	}

	public static void showList(List<?> list){
		System.out.println(list);
	}

	public static void showList2(List<? extends Number> list){
		System.out.println(list);
	}

	public static void showList3(List<? super Number> list){
		System.out.println(list);
	}
}
