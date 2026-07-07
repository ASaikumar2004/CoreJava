package Arrays;

import java.util.Scanner;

public class MultiDA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int row=sc.nextInt();
		System.out.println("Enter the columns:");
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
