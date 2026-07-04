package ControlFlowStatements;

import java.util.Scanner;

public class UniversityScholarship {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CGPA: ");
		double cgpa=sc.nextDouble();
		System.out.println("Enter the attendance percentage: ");
		int per=sc.nextInt();
		System.out.println("Enter the annual family income: ");
		int annual=sc.nextInt();
		if(cgpa>=8.5 && per>=85 && annual<300000) {
			System.out.println("Scholarship confirmed");
		}
		else {
			System.out.println("rejection");
		}
		
		sc.close();
	}

}
