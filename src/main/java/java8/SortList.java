package com.ahasan.arraysdemo.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList{
	public static void main(String[] args){
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1 ,"Mahesh" ,12));
		list.add(new Student(3 ,"Suresh" ,15));
		list.add(new Student(2 ,"Nilesh" ,10));

		System.out.println("---Natural Sorting by Name---");
		list.stream().sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getName))
						.map(Student::getAge).forEach(System.out::println);
	}
}