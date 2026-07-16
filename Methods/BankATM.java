package Methods;

import java.util.Scanner;

public class BankATM {
	static Scanner sc = new Scanner(System.in);
	static double balance = 20000;

	// display menu
	public static void displaymenu() {
		System.out.println("==================Enter your option==============");
		System.out.println("1.checkbalance");
		System.out.println("2.deposit amount");
		System.out.println("3.withdraw amount");
		System.out.println("4.exit");
		System.out.println("Enter your choice : ");
	}

	// check balance method
	public static void checkbalance() {
		System.out.println("current balance: ₹ " + balance);
	}

	// deposit method
	public static void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println(amount + " deposit successful");
			System.out.println("Updated balance is: " + balance);
		} else {
			System.out.println("Deposit failed due to invalid amount");
		}
	}

	public static void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("withdraw successful " + amount + "\n remaining balance is: " + balance);
		} else {
			System.out.println("Withdraw failed due to insuffient funds: " + balance);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			displaymenu();
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				checkbalance();
				break;
			
			case 2:
				System.out.println("Enter the deposit amount: ");
				double amount=sc.nextDouble();
				deposit(amount);
				break;
			
			case 3:
				System.out.println("Enter the amount to withdraw: ");
				double amount1=sc.nextDouble();
				withdraw(amount1);
				break;
			
			case 4:
				System.out.println("Thank you for using our ATM.");
				break;
			default:
				System.out.println("Invalid choice choosen Please try again!!.....");
			}
		} while (choice != 4);
		sc.close();
	}
}
