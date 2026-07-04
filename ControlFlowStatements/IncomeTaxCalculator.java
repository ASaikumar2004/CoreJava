package ControlFlowStatements;

import java.util.Scanner;

public class IncomeTaxCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Annual income: ");
		int income=sc.nextInt();
		double income1;
		if(income<=400000) {
			income=income-0;
			System.out.println("No tax Deduction");
		}
		else if(income>=400001 && income<=800000) {
			income1=income-(income*0.05);
			System.out.println("income deduction is 5% so: "+income1);
		}
		else if(income>=800001 && income<=1200000) {
			income1=income-(income*0.10);
			System.out.println("income deduction is 10% so: "+income1);
		}
		else if(income>=1200001 && income<=2000000) {
			income1=income-(income*0.20);
			System.out.println("income deduction is 20% so: "+income1);
		}
		else {
			income1=income-(income*0.30);
			System.out.println("income deduction is 30% so: "+income1);
		}
		
		sc.close();
	}

}
