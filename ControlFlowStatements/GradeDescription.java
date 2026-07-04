package ControlFlowStatements;

import java.util.Scanner;

public class GradeDescription {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inputs: (a,b,c,d,f)");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'A':
			System.out.println(" Excellent");
			break;
		case 'B':
			System.out.println("Very Good");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'd':
			System.out.println("Needs Improvement");
			break;
		case 'f':
			System.out.println("Failed");
			break;
		default:
			System.out.println("Enter the correct character");
		}
		
		sc.close();
	}
}
