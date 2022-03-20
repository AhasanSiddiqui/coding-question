package com.ahasan.arraysdemo.sapient;

public enum TRANSACTION_TYPE{
	BUY(1,"BUY"),SELL(2,"SELL"),DEPOSIT(3,"DEPOSIT"),WITHDRAW(4,"WITHDRAW");
	private int type;
	private String name;

	TRANSACTION_TYPE(int type ,String name){
		this.type=type;
		this.name=name;
	}

	public int getType(){
		return type;
	}

	public String getName(){
		return name;
	}
}
