package Arrays;

public class MinimumNumber {
public static void main(String[] args) {
	int[] arr= {5,7,9,4,2,4,5,87};
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println(min);
}
}
