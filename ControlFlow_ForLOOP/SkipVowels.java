package ControlFlow_ForLOOP;

import java.util.Scanner;

public class SkipVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			char lc=Character.toLowerCase(ch);
			if(lc=='a'||lc=='e'||lc=='i'||lc=='o'||lc=='u') {
				continue;
			}
			res=res+String.valueOf(ch);
		}
		System.out.println(res);
		
		sc.close();
	}
}
