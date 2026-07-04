package ControlFlow_ForLOOP;

public class Fibbonaci {
	public static void main(String[] args) {
		int n = 7;
		int a = 0;
		int b = 1;
		int temp = 0;
		while(n>0){
			System.out.print(a+" ");
			temp = a + b;
			a = b;
			b = temp;
			n--;
		}
		
	}
}
