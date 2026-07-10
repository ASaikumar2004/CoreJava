package Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr= {8,3,4,6,7,1,2,8};
		int max=arr[0];
		int smax=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax && arr[i]<max) {
				smax=arr[i];
			}
		}
		System.out.println("max is:"+max);
		System.out.println("Second max is:"+smax);
	}

}
