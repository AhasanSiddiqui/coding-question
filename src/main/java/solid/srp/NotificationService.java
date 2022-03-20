package com.ahasan.arraysdemo.solid.srp;

public class NotificationService {

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
