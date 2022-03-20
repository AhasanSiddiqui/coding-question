package com.ahasan.arraysdemo.kkthread;

public class KkTest {

	public static void main(String[] args) {
		TicketCounter ticketCounter=new TicketCounter();

		TicketBookingThread bookingThread1=new TicketBookingThread(ticketCounter,
				"Ahasan",2);
		TicketBookingThread bookingThread2=new TicketBookingThread(ticketCounter,
				"Siddiqui",2);

		bookingThread1.start();
		bookingThread2.start();
	}
}
