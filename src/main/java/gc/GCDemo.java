package com.ahasan.arraysdemo.gc;

import java.util.Date;

public class GCDemo {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());

		System.out.println(runtime.totalMemory()-runtime.freeMemory());

		for (int i = 0; i < 10000000; i++) {
			new Date();
		}

		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.totalMemory()-runtime.freeMemory());

		runtime.gc();
		System.gc();
		System.out.println(runtime.freeMemory());
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Ahasan");
	}
}
