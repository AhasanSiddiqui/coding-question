package com.ahasan.arraysdemo.numbersystem;

public class AnyBaseToDecimal {
	public static void main(String[] args) {
		System.out.println(anyBaseToDecimal(1111101000, 2));
	}

	public static int anyBaseToDecimal(int number, int base) {
		int rv = 0;
		int pow = 1;
		while (number > 0) {
			int dig = number % 10;
			number = number / 10;
			rv += dig * pow;
			pow = pow * base;
		}
		return rv;
	}
}
