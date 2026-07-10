package Arrays;

public class MinimumNumber {
public static void main(String[] args) {
	int[] arr= {5,7,9,4,2,4,-1,5,87,1};
	int min=arr[0];
	for(int j=0;j<arr.length;j++) {
		if(arr[j]<min) {
			min=arr[j];
		}
	}
	System.out.println("min: "+min);
}
}
