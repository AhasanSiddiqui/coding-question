package com.ahasan.arraysdemo.nagerro;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static String postfixToInfix(String S) {
	
	    //this is default OUTPUT. You can change it.
		String result="-404";
		
		//write your Logic here:
		Stack<String> s=new Stack<>();

		for(int i=0;i<S.length();i++) {
			if(isOp(S.charAt(i))) {
				s.push(S.charAt(i)+"");
			} 
			else {
				String op1=s.peek();
				s.pop();
				String op2=s.peek();
				s.pop();
				s.push("("+op2+S.charAt(i)+op1+")");
			}
		}
		result=s.peek();
		return result;
	}

	static boolean isOp(char ch) {
		return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');

	}

	public static void main(String[] args) {
		//INPUT [uncomment & modify if required]
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		
		//OUTPUT [uncomment & modify if required]
		System.out.print(postfixToInfix(S));
		sc.close();
	}

}