package Arrays;

import java.util.Scanner;

public class ToD_ArrayDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row Size: ");
	int row=sc.nextInt();
	System.out.println("Enter the col size: ");
	int col=sc.nextInt();
	int[][] arr= new int[row][col];
	System.out.println("Enter array elements: ");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			arr[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	
	
//	to print the array
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
