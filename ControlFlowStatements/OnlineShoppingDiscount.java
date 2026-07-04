package ControlFlowStatements;

import java.util.Scanner;

public class OnlineShoppingDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		int pa=sc.nextInt();
		System.out.println("Enter you are a premium user or not(true/false)");
		boolean prem=sc.nextBoolean();
		double amount;
		if(prem) {
			if(pa>=10000) {
			double tamount=pa-(pa*0.2);
			System.out.println("for premium members after 10000 shopping: "+tamount);
			}
			else if(pa>=5000) {
			amount=pa-(pa*0.1);
			System.out.println("for premium members after 5000 shopping: "+amount);
			}
			else {
				System.out.println("no discount applied: "+pa);
			}
		}
		else if(prem) {
			if(pa>=10000) {
				amount=pa-(pa*0.1);  
				System.out.println("for NON premium members after 10000 shopping: "+amount);
				}
				else if(pa>=5000) {
				amount=pa-(pa*0.05);
				System.out.println("for NON premium members after 5000 shopping: "+amount);
				}
				else {
					System.out.println("No Discount appiled: "+pa);
				}
		}
		sc.close();
	}
}
