package ControlFlow_ForLOOP;
import java.util.*;
public class SumofDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	int ori=n;
	int sum=0;
	while(n!=0) {
		int digit=n%10;
		sum=sum+digit;
		n=n/10;
	}
	System.out.println("sum of "+ori+" is: "+sum);
	
	sc.close();
}
}
