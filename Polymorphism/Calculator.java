package Polymorphism;
class addition{
	
	int a;
	public addition() {
		System.out.println("it is default constructor");
	}
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public void add(double a, int b) {
		System.out.println(a+b);
	}
}
public class Calculator {
public static void main(String[] args) {
	addition add=new addition();
	int res=add.add(20, 10);
	System.out.println(res);
}
}
