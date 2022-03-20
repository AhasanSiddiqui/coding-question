package com.ahasan.arraysdemo.sapient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Transaction{
	private String externalTransactionId;
	private String clientId;
	private String securityId;
	private Integer transactionType;
	private  java.util.Date transactionDate;
	private Double marketValue;
	private boolean priority;
	private Double transactionFees;


}
