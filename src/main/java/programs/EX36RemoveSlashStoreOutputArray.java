/**
 * String input1="AAA/abb/CCC"
 * char   input2='/'
 * output-- String[] output;
 * output[]={"aaa","bba","ccc"};
 * operation-- get the strings from input1using stringtokenizer reverse each string then to lower case finally store it in output1[] string array  
 */

package com.ahasan.arraysdemo.programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EX36RemoveSlashStoreOutputArray {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String input = in.next();
		String input2 = "/";

		int size = 0;
		String token = "";

		StringTokenizer st = new StringTokenizer(input, input2);
		size = st.countTokens();

		String[] output = new String[size];
		int i = 0;
		while (st.hasMoreTokens()) {
			token = (st.nextToken()).toLowerCase();
			output[i] = token;
			i++;
		}

		StringBuffer sb;

		for (int j = 0; j < output.length; j++) {
			sb = new StringBuffer();
			sb.append(output[j]);
			output[j] = sb.reverse().toString();
		}

		for (int k = 0; k < output.length; k++) {
			System.out.println(output[k]);
		}
	}
}
