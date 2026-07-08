package Arrays;

import java.util.Scanner;

public class SumJaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int row = sc.nextInt();
		int[][] arr = new int[row][];
		
		for (int i = 0; i < row; i++) {
			System.out.println("Enter the columns of " + i + " row: ");
			int col = sc.nextInt();
			arr[i] = new int[col];
			System.out.println("Enter the elements: ");
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
