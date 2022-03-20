package com.ahasan.arraysdemo.numbersystem;

public class AnyBaseAny {
	public static void main(String[] args) {
		System.out.println(getValue(178, 8, 2));
	}

	private static int getValue(int number, int b1, int b2) {
		int dec = AnyBaseToDecimal.anyBaseToDecimal(number, b1);
		int dn = DecimalToAnyBase.decimalToAnyBase(dec, b2);
		return dn;
	}
}
