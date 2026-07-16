package Methods;

import java.util.Scanner;

public class OnlineFoodOrderingSystem {
	static String fooditem;
	static int quantity;
	static double price;
	static double bill;
	static double discount;
	static double finalbill;

	public void displaymenu() {
		System.out.println("===========menu food items============");
		System.out.println("1.biryani    - ₹190");
		System.out.println("2.icecream   - ₹30");
		System.out.println("3.cake       - ₹399");
		System.out.println("4.fruits     - ₹100");
		System.out.println("5.friedrice  - ₹110");
	}

	public void calculatebill(int quantity, double price) {
		bill = quantity * price;
	}

	public void calculatediscount(double bill) {
		if (bill > 1000) {
			discount = bill * 0.10;
		}
		else {
			discount=0;
		}
		finalbill = bill - discount;
	}

	public static void printBill() {
		System.out.println("\n========== BILL ==========");
		System.out.println("Food Item   : " + fooditem);
		System.out.println("Quantity    : " + quantity);
		System.out.println("Price       : ₹" + price);
		System.out.println("Total Bill  : ₹" + bill);
		System.out.printf("Discount    : ₹ %.2f"  ,discount);
		System.out.println();
		System.out.println("Final Bill  : ₹" + finalbill);
	}

	public static void main(String[] args) {
		OnlineFoodOrderingSystem o = new OnlineFoodOrderingSystem();
		Scanner sc = new Scanner(System.in);

		o.displaymenu();
		System.out.println("Enter your choice:(1-5) ");
		int choice = sc.nextInt();
		switch (choice) {
		
		case 1:
			fooditem="biryani";
			price=190;
			break;
			
		case 2:
			fooditem="Ice cream";
			price=30;
			break;
		
		case 3:
			fooditem="cake";
			price=399;
			break;
			
		case 4:
			fooditem="fruits";
			price=100;
			break;
			
		case 5:
			fooditem="friedrice";
			price=110;
			break;
		default:
			System.out.println("invalid choice! item not available");
		}
		
		System.out.println("Enter Quantity: ");
		quantity=sc.nextInt();
		
		o.calculatebill(quantity, price);
		o.calculatediscount(bill);
		printBill();
		sc.close();

	}
}
