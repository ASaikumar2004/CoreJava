package Operators;
import java.util.*;
public class StudentPassorFail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		System.out.println("Enter the attendance percentage");
		int attend=sc.nextInt();
		String result=(marks>=35 && attend>=75)?"pass":"fail";
		System.out.println(result);
		sc.close();
	}
}
