package ControlFlow_ForLOOP;

import java.util.Scanner;

public class Evennumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers: ");
	int n=3;
	while(n!=0) {
		int i=sc.nextInt();
		if(i%2==0) {
			System.out.println("Entered even number: "+i);
			break;
		}
		n--;
	}
	if(n==0) {
		System.out.println("No Even the numbers entered");
	}
	
	
	
	
//	int n=sc.nextInt();
//	for(int i=2;i<=n;i+=2) {
//		System.out.println(i);
//	}
	
	sc.close();
}
}
