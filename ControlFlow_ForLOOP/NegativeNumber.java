package ControlFlow_ForLOOP;

import java.util.Scanner;

public class NegativeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Start entering numbers: ");
		while(true) {
			int i=sc.nextInt();
			if(i<0) {
				break;
				};
			System.out.println(i);
		}
		System.out.println("program ended");
		sc.close();
	}

}
