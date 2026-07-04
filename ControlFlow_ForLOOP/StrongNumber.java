package ControlFlow_ForLOOP;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nummber to check strong ot not: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n = n / 10;
		}
		
		if (temp == sum) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not strong");
		}
		sc.close();
	}
}
