package Arrays;

public class SecondMinimum {
public static void main(String[] args) {
	int arr[]= {1,7,8,4,1,2,6,5};
	int min=arr[0];
	int smin=arr[1];
	for(int i=2;i<arr.length;i++) {
		if(arr[i]<min) {
			smin=min;
			min=arr[i];
		}
		else if(arr[i]<smin && arr[i]>min) {
			smin=arr[i];
		}
	}
	System.out.println("second min: "+smin);
}
}
