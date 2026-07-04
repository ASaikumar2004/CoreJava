package ControlFlow_ForLOOP;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int n=sc.nextInt();
	 int prod=n*n;
	 int sum=0;
	 while(prod>0) {
		int rem=prod%10;
		sum=sum+rem;
		prod=prod/10;
	 }
	 if(sum==n) {
		 System.out.println("NEON number");
	 }
	 else {
		 System.out.println("not a neon");
	 }
	 sc.close();
	}
}
