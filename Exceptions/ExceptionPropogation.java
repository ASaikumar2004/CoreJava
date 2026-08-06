package Exceptions;

public class ExceptionPropogation {
	
	public static void m1() {
		m2();
	}
	
	public static void m2() {
		try {
		m3();
		}catch(Exception e) {
			System.out.println("Is handled in m2 method");
		}
	}
	
	public static void m3() {
		int num=10/0;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		try {
		m1();}
		catch(Exception e) {
			System.out.println("handled in main method");
		}
		
		System.out.println("it is main method");
	}

}
