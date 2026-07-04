package ControlFlow_ForLOOP;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int small=9;
		while(n!=0) {
			int rem=n%10;
			if(rem<small) {
				small=rem;
			}
			n=n/10;	
		}
		System.out.println("small is: "+small);
		sc.close();
	}
}
