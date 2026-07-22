package FunctionalRecursion;

public class ArmstrongNumber {
	
	static public int countdigit(int n) {
		if(n==0) {
			return 0;
		}
		return 1+countdigit(n/10);
	}
	
	static public int armstrong(int n, int digits) {
		if(n==0) {
			return 0;
		}
		int digit=n%10;
		return (int)Math.pow(digit, digits)+armstrong(n/10,digits);
	}

	public static void main(String[] args) {
		int n=1561;
		int digits=countdigit(n);
		int res=armstrong(n, digits);
		System.out.println(res);
		if(res==n) { 
			System.out.println("Given number is armstrong");
		}
		else {
			System.out.println("not an armstrong");
		}
	}
}
