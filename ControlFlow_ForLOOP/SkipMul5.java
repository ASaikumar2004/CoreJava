package ControlFlow_ForLOOP;

import java.util.Scanner;

public class SkipMul5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.println();
				continue;
			}
			System.out.println(i);
		}
		
		sc.close();
	}
}
