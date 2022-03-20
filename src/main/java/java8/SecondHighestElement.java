package com.ahasan.arraysdemo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestElement{
	public static void main(String[] args){
		List<Integer> list=Arrays.asList(2 ,4 ,6 ,7 ,88 ,11 ,22 ,3 ,12 ,34 ,56 ,54);

		/*Integer integer=list.stream().sorted(Collections.reverseOrder())
							.distinct().limit(2).skip(1).findFirst().get();

		Integer integer1=list.stream().sorted().limit(2).skip(1).findFirst().get();*/

		Integer integer2 = list.stream().max((x,y)->x.compareTo(y)).get();

		Integer integer3 = list.stream().filter(x->x<integer2).max((x,y)->x.compareTo(y)).get();

		System.out.println("Second max is: "+integer3);
		System.out.println(integer3);
	}
}
