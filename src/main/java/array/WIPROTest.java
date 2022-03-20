package com.ahasan.arraysdemo.array;

public class WIPROTest {

	public static void main(String[] args) {
		String vowelCheck="ahasan";
		printVowel(vowelCheck);

		A aa =new A();
		System.out.println(aa.a);

	}

	private static void printVowel(String vowelCheck) {

		vowelCheck.toLowerCase().toCharArray();

		for (int vo = 0; vo < vowelCheck.length(); vo++) {

			if(vowelCheck.charAt(vo) =='a' || vowelCheck.charAt(vo) =='e' ||
			vowelCheck.charAt(vo) =='i' ||
			vowelCheck.charAt(vo) =='o' ||
			vowelCheck.charAt(vo) =='u')  {
				System.out.println(vowelCheck.charAt(vo));
			}
		}
	}
}

class A {
	int a=10;


}

class B  extends A {

}
