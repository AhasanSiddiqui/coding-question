package com.ahasan.arraysdemo.java8;

@FunctionalInterface
public interface Interf{
	void m1();
	//void m2();
	default void m2() {
		System.out.println("Default Method");
	}

	static void m3() {
		System.out.println("Default Method");
	}

	default void m4() {
		System.out.println("Default Method");
	}
}

@FunctionalInterface
interface child extends Interf{
	public void m1();
}
