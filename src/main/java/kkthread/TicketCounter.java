package com.ahasan.arraysdemo.kkthread;

public class TicketCounter {

	private int availableSeats = 3;

	public synchronized void bookTicket(String pName, int numberOfSeats) {
		if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
			System.out.println("Hi " + pName + " : " + numberOfSeats + " Seats booked successfully");
			availableSeats = availableSeats - numberOfSeats;
		} else{
			System.out.println("Hi " + pName + " Seats Not Available");
		}
	}
}
