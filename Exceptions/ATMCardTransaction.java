package Exceptions;

import java.util.Scanner;

class InvalidCardException extends Exception{
	public InvalidCardException(String msg) {
		super(msg);
	}
}

public class ATMCardTransaction {
	
	public static  void checkcard(boolean isExpired) throws InvalidCardException{
		if(isExpired) {
		throw new InvalidCardException("card expired! unable to withdrw the cash");
	}
		else {
			System.out.println("Transction Allowed");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" IS card Expired? true / false: ");
		boolean isExpired=sc.nextBoolean();
		
		try {
			checkcard(isExpired);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
