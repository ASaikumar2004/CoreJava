package ControlFlowStatements;

import java.util.Scanner;

public class CollegeAdmissionSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the exam rank: ");
		int rank=sc.nextInt();
		System.out.println("Enter the intermediate percentage: ");
		int per=sc.nextInt();
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		if(rank<=1000 && per>=75) {
			if(age>17) {
			System.out.println("Admission confirmed");
		    }
			else {
				System.out.println("Not eligible");
			}
		}
		else {
			System.out.println("Not matched");
		}
		sc.close();
	}
}
