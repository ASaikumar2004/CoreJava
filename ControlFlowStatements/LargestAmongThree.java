package ControlFlowStatements;

import java.util.*;

public class LargestAmongThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("A is largest");	
		}
		else if(b>c && b>a) {
			System.out.println("B is largest");
		}
		else {
			System.out.println("c is largest");
		}
		
		sc.close();
	}
}
