package Exceptions;

public class throwDemo {
	public static void check(int age) {
		if(age < 18) {
			throw new IllegalArgumentException("NOt eligible");   //throw can manully create an object and handle the exception
		}
		
		System.out.println("He is eligible");
	}
	
	
	public static void main(String[] args) {
		
		try {
		check(12);
		}
		catch(Exception e) {
			System.out.println("It is handle by main method");
		}
		System.out.println("it is main method");
	}

}
