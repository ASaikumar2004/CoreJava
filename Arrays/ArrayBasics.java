package Arrays;

import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		
////		intialization of an Array
//		int[] arr1= {10,20,30,40,50};
//		for(int i=0;i<=arr1.length-1;i++) {
//			System.out.println(arr1[i]);
//		}
		sc.close();

	}

}
