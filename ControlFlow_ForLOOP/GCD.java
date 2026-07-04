package ControlFlow_ForLOOP;

import java.util.*;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int a=sc.nextInt();
		System.out.println("Enter the second value: ");
		int b=sc.nextInt();
		while(b!=0) {
			int temp=a%b;
			a=b;
			b=temp;
		}
		System.out.println("GCD of two numbers is: "+a);
		sc.close();
	}
}
