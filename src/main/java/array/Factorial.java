package com.ahasan.arraysdemo.array;

public class Factorial {

	public static void main(String[] args) {
		int number =123;
		int num=5;
		System.out.println(findFactorial(num));
		System.out.println(reverseInteger(number));
		System.out.println(reverseInteger2(number));
	}

	private static int reverseInteger2(int number) {
		int rem;
		int result=0;
		while (number>0) {
			rem=number%10;
			result=result*10+rem;
			number=number/10;
		}
		return result;
	}

	private static int reverseInteger(int number) {
		return Integer.parseInt(new StringBuilder(""+number).reverse().toString());
	}

	private static int  findFactorial(int n) {

		int factorial =1;
		for(int i=1;i<=n;i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
}
