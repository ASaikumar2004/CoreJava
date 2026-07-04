package ControlFlow_ForLOOP;

import java.util.Scanner;

public class LargestDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int large=0;
	while(n!=0) {
		int rem=n%10;
		if(rem>large) {
			large=rem;
		}
		n=n/10;
	}
	System.out.println(large);
	
	
	sc.close();
}
}
