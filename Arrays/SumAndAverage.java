package Arrays;

import java.util.Scanner;

public class SumAndAverage {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array: ");
	int size=sc.nextInt();
	int[] arr=new int[size];
	int sum=0;
	System.out.println("Enter the array elements: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	int average=sum/arr.length;
	System.out.println("Sum of array elements are: "+sum);
	System.out.println("Average of array elements is: "+average);
	
	sc.close();
}
}
