package com.ahasan.arraysdemo.kkthread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TicketBookingThread extends Thread{
	private TicketCounter ticketCounter;
	private String passengerName;
	private int numberOfSeatsToBook;

	@Override
	public void run() {
		ticketCounter.bookTicket(passengerName,numberOfSeatsToBook);
	}
}
