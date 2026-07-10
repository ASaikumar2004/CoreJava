package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,-5};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
//		Accessing last element;
		System.out.println("last element: "+arr[arr.length-1]);
		
//		Accessing elements using index value
		System.out.println(arr[2]);
	}

}
