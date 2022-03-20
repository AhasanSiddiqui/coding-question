package com.ahasan.arraysdemo.strings;

public class IPAddress {

	public static void main(String[] args) {
		defangIPaddr("1.1.1.1");
	}

	public static String defangIPaddr(String address) {
		String []str= address.split("[.]");
		String ipAddress="";
		for(int i=0;i<str.length;i++){
			ipAddress+=str[i]+"[.]";
		}
		return ipAddress;
	}
}
