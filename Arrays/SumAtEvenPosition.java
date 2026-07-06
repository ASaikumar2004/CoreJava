package Arrays;

import java.util.Scanner;

public class SumAtEvenPosition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr= {1,2,3,4,5,6,7,8};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			sum=sum+arr[i];
		}
	}
	System.out.println(sum);
	sc.close();
}
}
