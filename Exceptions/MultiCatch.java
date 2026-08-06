package Exceptions;

public class MultiCatch {
	
	public static void main(String[] args) {
		
		int choice=1;
		int num=10;
		String s=null;
		
		try {
			switch(choice) {
			
			case 1:
				System.out.println(num/0);
				break;
				
			case 2:
				System.out.println(s.length());
				break;
			}
		}catch(ArithmeticException | NullPointerException e){
			e.printStackTrace();
		}
		System.out.println("Successfully Excuted program");
	}

}
