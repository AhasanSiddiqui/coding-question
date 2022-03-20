package com.ahasan.arraysdemo.sapient;

public enum FILE_TYPE{
	CSV(1),XML(2),TEXT(3);
	private final int type;

	FILE_TYPE(int type){
		this.type=type;
	}
}
