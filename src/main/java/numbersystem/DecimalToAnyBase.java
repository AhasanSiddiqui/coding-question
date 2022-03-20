package com.ahasan.arraysdemo.numbersystem;

public class DecimalToAnyBase {
	public static void main(String[] args) {
		System.out.println(decimalToAnyBase(634, 8));
	}

	public static int decimalToAnyBase(int num, int base) {
		int rv = 0;
		int pow = 1;
		while (num > 0) {
			int digit = num % base;
			num = num / base;
			rv += digit * pow;
			pow = pow * 10;
		}
		return rv;
	}
}
