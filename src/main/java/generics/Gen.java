package com.ahasan.arraysdemo.generics;

public class Gen<T> {
	T obj;

	public Gen(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void show() {
		System.out.println("Type of Object is : "+obj.getClass().getName());
	}

	public static void main(String[] args) {
		Gen<String> stringGen=new Gen<>("Ahasan");
		stringGen.show();
		System.out.println(stringGen.getObj());

		Gen<Integer> integerGen=new Gen<>(100);
		integerGen.show();
		System.out.println(integerGen.getObj());

		Gen<Double> doubleGen=new Gen<>(100.0);
		doubleGen.show();
		System.out.println(doubleGen.getObj());
	}
}
