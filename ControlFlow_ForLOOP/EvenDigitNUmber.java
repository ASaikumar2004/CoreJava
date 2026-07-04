package ControlFlow_ForLOOP;

import java.util.Scanner;

public class EvenDigitNUmber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		String str=" ";
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) {
				str=rem+" "+str;
			}
			n=n/10;	
		}
		System.out.print(str);
		sc.close();
	}

}
