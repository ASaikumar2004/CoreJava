package ControlFlow_ForLOOP;

import java.util.Scanner;

public class DecimalConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to convert");
		int n=sc.nextInt();
		String binary="";
		if(n==0) {
			System.out.println("Binary number is: "+n);
		}
		while(n>0) {
			int rem=n%2;
			binary=rem+binary;
			n=n/2;
			
		}
		System.out.println("Binary number is: "+binary);
		sc.close();
	}

}
