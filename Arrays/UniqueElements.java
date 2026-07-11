package Arrays;

public class UniqueElements {
public static void main(String[] args) {
	int arr[]= {4,3,4,2};
	
	for(int i=0;i<arr.length;i++) {
		int count=1;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j] && i!=j) {
				count++;
			}
		}
		if(count!=1) {
			System.out.print(arr[i]+" ");
		}
	}
}
}
