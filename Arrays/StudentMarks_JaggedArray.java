package Arrays;

import java.util.Scanner;

public class StudentMarks_JaggedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the students names in rows:");
		int row=sc.nextInt();
		int[][] arr=new int[row][];
		for(int i=0;i<row;i++) {
			System.out.println("Enter the Colums in "+i+" row:");
			int col=sc.nextInt();
			arr[i]=new int[col];
			System.out.println("Enter the array elements: ");
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		
		sc.close();
	}
}
