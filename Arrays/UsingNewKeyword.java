package Arrays;

import java.util.Scanner;

public class UsingNewKeyword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size=sc.nextInt();
		String[] arr=new String[size];
		System.out.println("Enter Array elements in String: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.next();
		}
//		
//		
//		String[] arr=new String[5];
//		arr[0]="Sai";
//		arr[1]="sivani";
//		arr[2]="arjun";
//		arr[3]="Kushal";
//		arr[4]="Kowshik";
////		Updating the array elements;
//		arr[1]="My LoVe: SiVaNi";
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
