package ControlFlow_ForLOOP;

//Input: 123
//Sum: 1 + 2 + 3 = 6
//Product: 1 * 2 * 3 = 6
//Output: Yes, 123 is a spy number.

import java.util.Scanner;

public class SpyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check spy or not");
	int n=sc.nextInt();
	int sum=0;
	int product=1;
	while(n>0) {
		int rem=n%10;
		sum=sum+rem;
		product=product*rem;
		n=n/10;
	}
	if(sum==product) {
		System.out.println("Spy number");
	}
	else {
		System.out.println("not a spy number");
	}
	sc.close();
}
}
