package com.ahasan.arraysdemo.solid.srp;

public class BankService {
	// Can be Part of Bank Service Class to follow Single Responsibility Principle
	public long deposit(long amount, String accountNo) {
		return 0;
	}

	// Can be Part of Bank Service Class to follow Single Responsibility Principle
	public long withDraw(long amount, String accountNo) {
		return 0;
	}

	// Move This Code to Printer Service Class to follow Single Responsibility Principle
	public void printPassbook() {
		System.out.println("Passbook Printing");
	}

	// Move This Code to Loan Service Class to follow Single Responsibility Principle
	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("HomeLoan")) {
			System.out.println("Home Loan");
		} else if (loanType.equals("EducationLoan")) {
			System.out.println("Education Loan");
		} else if (loanType.equals("PersonalLoan")) {
			System.out.println("Personal Loan");
		}
	}

	// Move This Code to Notification Service Class to follow Single Responsibility Principle
	public void sendOTP(String medium) {
		if (medium.equals("email")) {
			System.out.println("Send Email Notification");
		} else if (medium.equals("SMS")) {
			System.out.println("Send SMS Notification");
		} else if (medium.equals("WhatsApp")) {
			System.out.println("Send WhatsApp Notification");
		} // Some Other Functionality may Come in Future
	}
}
