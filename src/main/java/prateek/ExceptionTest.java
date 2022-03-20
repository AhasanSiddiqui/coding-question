package com.ahasan.arraysdemo.prateek;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			throw  new Test();
		} catch (Test test) {
			System.out.println("Got the Test Exception");
		} finally {
			System.out.println("Inside Finally Block");
		}
	}
}

class Test extends Exception {

}