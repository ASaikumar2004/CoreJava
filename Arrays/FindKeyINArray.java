package Arrays;

public class FindKeyINArray {
	public static void main(String[] args) {
	 int arr[]= {10,20,30,40,50,32,2};
	 int key=2;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]==key) {
			 System.out.println("Found key at index: " +i);
		 }
	 }
	}
}
