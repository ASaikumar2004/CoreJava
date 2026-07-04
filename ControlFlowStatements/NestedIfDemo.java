package ControlFlowStatements;

import java.util.*;

public class NestedIfDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "sai";
		int password = 123;
		System.out.print("Enter the uname: ");
		String uname = sc.next();
		System.out.print("Enter the password: ");
		int upass = sc.nextInt();
		if (name.equals(uname)) {
			if (password == upass) {
				System.out.println("Login successful");
			} else {
				System.out.println("Login failed");
			}
		} 
		else {
			System.out.println("invalid creditionals");
		}
	}

}
