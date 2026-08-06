package Exceptions;

public class FinallyDemo {
	public static void main(String[] args) {
		try {
			int num=10/0;
			System.out.println(num);
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("it is finally block");
		}
	}

}
