package com.ahasan.arraysdemo.innerclasses;

public class MethodLocal {
	public void m2() {
		int x=10;
		class MethodLocalInner {

			public int sum(int a,int b) {
				System.out.println(x);
				return a+b;
			}
		}
		MethodLocalInner inner=new MethodLocalInner();
		System.out.println(inner.sum(10,10));
	}

	public static void main(String[] args) {
		MethodLocal methodLocal=new MethodLocal();
		methodLocal.m2();
	}
}
