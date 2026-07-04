package ControlFlowStatements;

import java.util.Scanner;

public class ATMCashWithdrawal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin=1234;
		int balance=10000;
		System.out.println("Enter Withdraw Amount: ");
		double wta=sc.nextDouble();
		System.out.println("Enter the pin: ");
		int pin1=sc.nextInt();
		if(pin==pin1) {
			if(wta<=balance) {
				
				System.out.println("collect your cash");
			}
			else {
				System.out.println("Insuffient funds");
			}
			
		}
		else {
			System.out.println("Wrong pin entered! please check your pin");
		}
		
		sc.close();
	}
}
