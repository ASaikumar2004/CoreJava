package Exceptions;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		int num=10, div=2, res=0;
		String s=null;
		try {
			System.out.println(s.length());
		    res=num/div;
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Try-catch-block is executed");
			
		}
		
		System.out.println(res);
		System.out.println("Bye");
		
	}

}
