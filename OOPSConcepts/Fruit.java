package OOPSConcepts;

import java.util.Scanner;

public class Fruit {

	static Scanner sc = new Scanner(System.in);

	String name;
	double price;
	String color;

	static Fruit[] fru = new Fruit[10];
	static int index = 0;

	// constructor
	public Fruit(String name, double price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	static void addfruit() {

		System.out.println("Enter the name: ");
		String name = sc.next();

		System.out.println("Enter the price");
		double price = sc.nextDouble();

		System.out.println("Enter the color: ");
		String color = sc.next();

		Fruit f = new Fruit(name, price, color);
		fru[index++] = f;
		System.out.println("Added sucessfully.....!!!!");

	}

	static void display() {
		for (int i = 0; i < index; i++) {
			System.out.println(fru[i].name);
			System.out.println(fru[i].price);
			System.out.println(fru[i].color);
		}
	}

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println(" 1.addfruit\n 2.displayfruits\n 3.checkfruit\n 4.exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addfruit();
				break;
			case 2:
				display();
				break;
			case 4:
				System.out.println("Exit successfully");
				break;
			default:
				System.out.println("Invalid choice...!!!");
			}
		} while (choice != 4);
	}
}
