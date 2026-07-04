package ControlFlow_ForLOOP;

import java.util.Scanner;

public class ContinueDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=======ATM menu======\n 1.check balance\n 2.deposit money\n 3.withdraw\n4.mini statement\n5.exit");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Your balance is ₹25,000");
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			break;
		case 3:
			System.out.println("Enter amount to withdraw");
			break;
		case 4:
			System.out.println("Displaying mini statement..");
			break;
		case 5:
			System.out.println("Thank you for using our ATM");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
		sc.close();
	}
}
