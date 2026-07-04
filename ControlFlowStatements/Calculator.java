package ControlFlowStatements;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int a=sc.nextInt();
		System.out.println("Enter the secoind number: ");
		int b=sc.nextInt();
		System.out.println("Enter the operators to be performed:(+,-,*,/,%) ");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case '+':
			int sum=a+b;
			System.out.println("Addition of first and second is: "+sum);
			break;
		case '-':
			int sub=a-b;
			System.out.println("Substraction of first and second is: "+sub);
			break;
		case '*':
			int mul=a*b;
			System.out.println("Multiplication of first and second is: "+mul);
			break;
		case '/':
			int div=a/b;
			System.out.println("Division of first and second is: "+div);
			break;
		case '%':
			int mod=a%b;
			System.out.println("Moduloes of first and second is: "+mod);
			break;
		default:
			System.out.println("Invalid operators");
		}
		
		sc.close();
	}
}
