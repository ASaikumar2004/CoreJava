package ControlFlow_ForLOOP;

import java.util.Scanner;

public class SecretNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int secret=25;
	System.out.println("Enter the number: ");
	for(int i=3;i>=0;i--) {
		int key=sc.nextInt();
		if(key==secret) {
			System.out.println("Successful!..you have found the Secret code ");
			break;
		}
		else if(i==0) {
			System.out.println("try again after 30 seconds");
			
		}
		else{
			System.out.println("you have only "+i+" chances");
		}
	}
	
	sc.close();
}
}
