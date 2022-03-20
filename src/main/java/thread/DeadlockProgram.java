package com.ahasan.arraysdemo.thread;

import org.springframework.validation.ObjectError;

public class DeadlockProgram {
	public static void main(String[] args) {
		Object printer = new Object();
		Object scanner = new Object();

		//John has bunch of documents that it wants to Print and also want to take a scan later
		new Thread (new PrintAndScan(printer, scanner), "Ahasan").start();

		//Michael has bunch of documents that it wants to Scan and also want to take a print later
		new Thread (new ScanAndPrint(printer, scanner), "Siddiqui").start();
	}
}

//Thread which take multiple documents and for each document it does the Printing first and then Scans the document
//So it requires two resource Printer and Scanner.
class PrintAndScan implements Runnable {
	private final Object printer;
	private final Object scanner;

	public PrintAndScan (Object printer, Object scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void run() {
		//Do printing and scanning simultaneously.
		synchronized (printer) {
			System.out.println("Thread "+Thread.currentThread().getName() + " acquired printer");
			try {
				//Do printing work
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			//Scan the documents already printed
			System.out.println("Thread "+Thread.currentThread().getName() + " is waiting for scanner");
			synchronized (scanner) {
				System.out.println("Thread "+Thread.currentThread().getName() + " is scanning");
			}
		}
	}
}

//Thread which take multiple documents and for each document it does the Scanning first and then Prints the document
//So it requires two resource Scanner and Printer.
class ScanAndPrint implements Runnable {
	private final Object printer;
	private final Object scanner;

	public ScanAndPrint (Object printer, Object scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void run() {
		//Do scanning and printing simultaneously.
		synchronized (scanner) {
			System.out.println("Thread "+Thread.currentThread().getName() + " acquired scanner");
			try {
				//Do scanning work
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			//Scan the documents already printed
			System.out.println("Thread "+Thread.currentThread().getName() + " is waiting for printer");
			synchronized (printer) {
				System.out.println("Thread "+Thread.currentThread().getName() + " is printing");
			}
		}
	}
}

/*
//Shared Resources
class Printer {}
class Scanner {}*/
