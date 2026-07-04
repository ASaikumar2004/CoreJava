package ControlFlow_ForLOOP;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	System.out.println("Enter the number to check: ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int original=n;
	int sum=0;
	
//	for counting the digits
	int count=0;
	for(int i=n;i>0;i=i/10) {
		count++;
	}
	
	for(int temp=n;temp>0;temp=temp/10) {
		int digit=temp%10;
		sum=sum+(int)Math.pow(digit, count);
	}
	if(sum==original) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not an Armstrong");
	}
	sc.close();
}
}
