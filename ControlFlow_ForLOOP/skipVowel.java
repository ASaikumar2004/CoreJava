package ControlFlow_ForLOOP;

import java.util.Scanner;

public class skipVowel {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word: ");
	String name=sc.next();
	String res="";
	for(int i=0;i<name.length();i++) {
		char ch=name.charAt(i);
		char lch=Character.toLowerCase(ch);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			continue;
		}
		res=res+String.valueOf(lch);	
	}
	System.out.println(res);
	sc.close();
}
}
