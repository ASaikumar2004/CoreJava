package Exceptions;

import java.util.Scanner;

class OutOfSeatsException extends Exception{
	public OutOfSeatsException(String message) {
		super(message);
	}
}

public class FlightTicketBooking {
	
	public static void checkavailability(int available, int seats)throws OutOfSeatsException {
		if(available < seats) {
			throw new OutOfSeatsException("Seats not confirmed ! out of bookings");
		}
		else {
			System.out.println("Booking confirmed...!!");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the available");
		int available=sc.nextInt();
		System.out.println("Enter the seats required");
		int seats=sc.nextInt();
		
		try {
			checkavailability(available, seats);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
