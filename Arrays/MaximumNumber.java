package Arrays;

import java.util.Scanner;

public class MaximumNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr= {10,2,4,1,61,14,21};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(max);
	sc.close();
}
}
