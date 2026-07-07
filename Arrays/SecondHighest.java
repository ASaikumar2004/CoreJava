package Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr= {8,3,4,6,7,1,2,8};
		int max=arr[0];
		int max2=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max || max==max2) {
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2 && arr[i]<max) {
				max2=arr[i];
			}
		}
		System.out.println(max2);

	}

}
