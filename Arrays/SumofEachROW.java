package Arrays;

import java.util.Scanner;

public class SumofEachROW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the no of columns: ");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
			System.out.println("Row "+i+" sum "+" = "+sum);
		}
		
		
	}
}
