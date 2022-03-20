package com.ahasan.arraysdemo.array;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Student1 {
	private String name;
	int id;
	double v;
	String male;
	int age;
	List<String> hobby;

	public Student1(String name, int id, double v, String male, int age, List<String> hobby) {
		this.name = name;
		this.id = id;
		this.v = v;
		this.male = male;
		this.age = age;
		this.hobby = hobby;
	}
}
