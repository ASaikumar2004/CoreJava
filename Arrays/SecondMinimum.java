package Arrays;

public class SecondMinimum {
public static void main(String[] args) {
	int arr[]= {1,7,8,4,6,2,2,5};
	int min=Integer.MAX_VALUE;
	int second=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			second=min;
			min=arr[i];
		}
		else if(arr[i]<second && arr[i]!=min) {
			second=arr[i];
		}
	}
	System.out.println(second);
}
}
