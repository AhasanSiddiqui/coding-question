package com.ahasan.arraysdemo.thread;

public enum DAYS{
	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);
	private int count;

	DAYS(int count) {
		this.count=count;
	}

	public int getCount(){
		return count;
	}

	public static void main(String[] args){
		System.out.println(SUNDAY.name());
	}
}
