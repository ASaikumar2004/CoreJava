package ControlFlowStatements;

import java.util.Scanner;

public class FoodOrderingSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("====Order your item from the menu===");
		System.out.println("1. Pizza\n2. Burger\n3. Sandwich\n4. Biryani\n5. Coffee");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("ordered items are:\npizza\nprice=200₹");
			break;
		case 2:
			System.out.println("ordered items are: \nBurger = 300₹");
			break;
		case 3:
			System.out.println("ordered items are: \nSandwich \n price=400₹");
			break;
		case 4:
			System.out.println("ordered items are: \nbiryani\n price=500₹");
			break;
		case 5:
			System.out.println("ordered items are: \nCoffee \n price=600₹");
			break;
		default:
			System.out.println("Item not Available.");
		}
		sc.close();

	}
}
