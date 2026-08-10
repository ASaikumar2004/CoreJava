package Arrays;

public class Prime {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 7, 9 };

		for (int i = 0; i < arr.length; i++) {
			boolean found = false;
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
