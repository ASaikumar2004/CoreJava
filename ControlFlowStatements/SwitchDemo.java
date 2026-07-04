package ControlFlowStatements;

import java.util.*;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day in between 0 to 6: ");
		int day = sc.nextInt();
		switch (day) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println("Invallid day selected");
		}

		sc.close();
	}
}
