package Arrays;

public class ArrayCopyToAnother {

	public static void main(String[] args) {
		int[] arr= {3,4,5,3,2};
//		int[] duparr= new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//			duparr[i]=arr[i];
//		}
		
		int[] copy=arr.clone();
		System.out.println();
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
	}

}
