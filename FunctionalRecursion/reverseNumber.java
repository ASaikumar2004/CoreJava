package FunctionalRecursion;

public class reverseNumber {
	static int r=0;
	static int rev(int n) {
		
		if(n==0) {
			return r;
		}
		else {
			r=r*10+(n%10);
			return rev(n/10);
		}
	}
	public static void main(String[] args) {
		int res=rev(123);
		System.out.println(res);
	}
}
