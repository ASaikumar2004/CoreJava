package Arrays;

public class Prime {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 7, 9 };

		for (int i = 0; i < arr.length; i++) {
			boolean found = false;
			for (int j = 1; j <= i; j++) {
				if (arr[i] % j == 0) {
					found = true;
				}
			}
			if(!found) {
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
