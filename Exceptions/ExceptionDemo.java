package Exceptions;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		int num=10, div=0, res=0;
		try {
		res=num/div;
		}
		catch(Exception exception) {
			System.out.println("cannot divide by zero");
		}
		
		System.out.println(res);
		System.out.println("Bye");
		
	}

}
