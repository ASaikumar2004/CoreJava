package FunctionalRecursion;

import java.util.Scanner;

public class Powers {
	static public int power(int a, int b) {
		if(b==0) {
			return 1;
		}
		else {
			return a * power(a,b-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value and b values ");
		System.out.println(power(sc.nextInt(),sc.nextInt()));
		sc.close();
	}
}
