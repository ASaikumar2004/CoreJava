package Exceptions;

public class FinallyWithMethodReturn {

	public static int test() {
		try {
			System.out.println("it is try block");
			return 1/0;
		} catch (Exception e) {
			System.out.println("It is catch blcok");
			return 2;
		} finally {
			System.out.println("finally block");
		}

	}
	
	public static void main(String[] args) {
		System.out.println(test());
	}

}
