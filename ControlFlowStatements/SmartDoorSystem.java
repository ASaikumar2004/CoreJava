package ControlFlowStatements;

import java.util.Scanner;

public class SmartDoorSystem {
	public static void main(String[] args) {
		int pin1=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Read Fingerprint(true/false): ");
		boolean finger=sc.nextBoolean();
		System.out.println("Read Face Recognition(true/false): ");
		boolean face=sc.nextBoolean();
		System.out.println("Enter your security pin: ");
		int pin=sc.nextInt();
		if(finger) {
			if(face) {
				if(pin==pin1) {
					System.out.println("Successfully opened");
				}
				else {
					System.out.println("pin not correct");
				}
			}
			else {
				System.out.println("face verify failed");
			}
		}
		else {
			System.out.println("finger verify failed");
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
