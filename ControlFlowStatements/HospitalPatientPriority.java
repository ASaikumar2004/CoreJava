package ControlFlowStatements;

import java.util.Scanner;

public class HospitalPatientPriority {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		System.out.println("Enter the body temprature: ");
		int bodytemp=sc.nextInt();
		System.out.println("Enter the oxygen temprature: ");
		int oxylev=sc.nextInt();
		if(oxylev<90) {
			System.out.println("Emergency");
		}
		else if(bodytemp>102 && age>60){
			System.out.println("High priority");
		}
		else {
			System.out.println("Normal priority");
		}
		sc.close();
	}

}
