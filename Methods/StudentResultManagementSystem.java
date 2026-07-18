package Methods;

import java.util.Scanner;

public class StudentResultManagementSystem {
	static int telugu;
	static int english;
	static int science;
	static int social;
	static int maths;
	static int total;
	static double average;
	
	//accept marks 
	public static void acceptmarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for telugu: ");
		telugu=sc.nextInt();
		System.out.println("enter marks for english: ");
		english=sc.nextInt();
		System.out.println("Enter marks for science: ");
		science=sc.nextInt();
		System.out.println("Enter marks for social: ");
		social=sc.nextInt();
		System.out.println("enter marks for maths");
		maths=sc.nextInt();
		
	}
	//calculate total marks
	public static void calculatetotal() {
		total=telugu+english+maths+science+social;
		System.out.println("Total marks obtained by the student is: "+total);
	}
	//calculate average marks
	public static void calculateaverage() {
		average=total/5.0;
		System.out.println("Average marks obtained by the student is: "+average);
	}
	
	//final grade
	public static void finalgrade() {
		if(average>=90 && average<=100) {
			System.out.println("A+ grade");
		}
		else if(average>=80 && average<=89) {
			System.out.println("A grade");
		}
		else if(average>=70 && average<=79) {
			System.out.println("B grade");
		}
		else if(average>=60 && average<=69) {
			System.out.println("C grade");
		}
		else {
			System.out.println("Fail");
		}	
	}
	
	//display result
	
	public static void display() {
		System.out.println("=========Students details:=============");
		System.out.println("marks in English: "+english);
		System.out.println("marks in Telugu: "+telugu);
		System.out.println("marks in Science: "+science);
		System.out.println("marks in social: "+social);
		System.out.println("marks in maths: "+maths);
		
		System.out.println("total marks: "+total);
		System.out.println("Average marks: "+average);
		finalgrade();
	}
	
	public static void main(String[] args) {
		acceptmarks();
		calculatetotal();
		calculateaverage();
		display();
	}
}
