package Exceptions;

import java.util.Scanner;

class OutOfStockException extends Exception{
	OutOfStockException(String msg) {
		super(msg);
	}
}

public class OnlineShoppingOrder {

	public static void checkstock(int available, int quantity)throws OutOfStockException{
			if(quantity > available) {
				throw new OutOfStockException("order failed! not enough stock available..");
			}
			else {
				System.out.println("Order confirmed.........");
			}
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter available stock");
		int available=sc.nextInt();
		
		System.out.println("enter the quantity");
		int quantity=sc.nextInt();
		
		try {
			checkstock(available, quantity);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
