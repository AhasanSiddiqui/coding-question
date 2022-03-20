package com.ahasan.arraysdemo.sapient;

public enum TRANSACTION_FEE{
	FIVE_HUNDRED(500),HUNDRED(100),FIFTY(50),TEN(10);
	private double fees;

	TRANSACTION_FEE(int fees){
		this.fees=fees;
	}

	public double getFees(){
		return fees;
	}
}
