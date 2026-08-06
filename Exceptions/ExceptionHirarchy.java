package Exceptions;

public class ExceptionHirarchy {
	
	public static void main(String[] args) {
		
		try {
			String s=null;
			//int num=10/0;
			System.out.println(s.length());
			//System.out.println(num);
		}
		catch(NullPointerException e) {
			System.out.println("is is child Exception");
			
		}
		catch(Exception e){
			System.out.println("Exception class");
		}
		
		
	}

}
