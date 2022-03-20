package com.ahasan.arraysdemo.sapient;

import java.io.IOException;
import java.util.List;

public class FeeEngine{
	public static void main(String[] args) throws IOException{
		List<Transaction> transactions = TransactionReader.readFile(FILE_TYPE.TEXT, "sampleData.txt");
		FeeCalculator calculator = new FeeCalculator();
		calculator.addTransaction(transactions);
		calculator.displayTransactionReport();
	}
}
