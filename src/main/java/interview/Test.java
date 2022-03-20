package com.ahasan.arraysdemo.interview;

interface  A {
	void m1();
}


interface  B {
	void m1();
}

class C implements A,B{

	@Override
	public void m1(){
		System.out.println("A called ");
	}
}
public class Test{
	public static void main(String[] args){
		B a =new C();
		a.m1();
	}
}
