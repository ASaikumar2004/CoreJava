package ControlFlowStatements;
import java.util.*;
public class IfelseifDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks=sc.nextInt();
		if(marks>=35 && marks<=50) {
			System.out.println("Student is just pass");
		}
		else if(marks>=51) {
			System.out.println("Student is good in this program");
		}
		else {
			System.out.println("Student is fail and not good in this program");
		}
			
		sc.close();

	}

}
