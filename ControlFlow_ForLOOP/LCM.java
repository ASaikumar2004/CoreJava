package ControlFlow_ForLOOP;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int a=sc.nextInt();
		int c=a;
		System.out.println("Enter the second value: ");
		int b=sc.nextInt();
		int d=b;
		while(b!=0) {
			int temp=a%b;
			a=b;
			b=temp;
		}
		int lcm=(c*d)/a;
		System.out.println("LCM of two numbers is: "+lcm);
		sc.close();
	}
}
