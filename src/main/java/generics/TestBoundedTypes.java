package com.ahasan.arraysdemo.generics;

public class TestBoundedTypes <T extends Number & Comparable>{
	public static void main(String[] args) {
		TestBoundedTypes<Integer> types1=new TestBoundedTypes<>();
		TestBoundedTypes<Double> types2=new TestBoundedTypes<>();
		TestBoundedTypes<Long> types3=new TestBoundedTypes<>();
		TestBoundedTypes<Float> types4=new TestBoundedTypes<>();
		//TestBoundedTypes<Number> types5=new TestBoundedTypes<>();
		TestBoundedTypes<Byte> types6=new TestBoundedTypes<>();

		System.out.println(types1.getClass().getSimpleName());
		System.out.println(types2.getClass().getSimpleName());
		System.out.println(types3.getClass().getSimpleName());
		System.out.println(types4.getClass().getSimpleName());
		//System.out.println(types5.getClass().getSimpleName());
		System.out.println(types6.getClass().getSimpleName());

	}
}
