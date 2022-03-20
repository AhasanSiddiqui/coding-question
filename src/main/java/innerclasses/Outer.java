package com.ahasan.arraysdemo.innerclasses;

public class Outer {
	int x = 10;
	class Inner {
		int x = 100;
		public void m1() {
			int x = 1000;
			System.out.println("Mohd Ahasan Siddiqui");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer.this.x);
		}
	}

	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.m1();
		//Or
		new Outer().new Inner().m1();
	}
}
