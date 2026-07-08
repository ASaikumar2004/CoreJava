package Arrays;

public class PrimeNumbers {
public static void main(String[] args) {
	int []arr= {13, 4, 56, 32, 99, 11};
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=1;j<=arr[i];j++) {
			if(arr[i]%j==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println(arr[i]);
		}
	}

}
}
