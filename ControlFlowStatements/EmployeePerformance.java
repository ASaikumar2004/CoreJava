package ControlFlowStatements;

import java.util.Scanner;

public class EmployeePerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the perfromace score in below 100: ");
	int per=sc.nextInt();
	if(per>=90 && per<=100) {
		System.out.println("Outstanding");
	}
	else if(per>=80 && per <=89){
		System.out.println("Excellent");
	}
	else if(per>=70 && per <=79){
		System.out.println("Good");
	}
	else if(per>=60 && per <=69){
		System.out.println("Average");
	}
	else {
		System.out.println("Needs Improvement");
	}
	
	sc.close();

	}

}
