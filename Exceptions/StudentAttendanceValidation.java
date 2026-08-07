package Exceptions;

class LowAttendanceException extends Exception{
	public LowAttendanceException(String msg) {
		super(msg);
	}
}

public class StudentAttendanceValidation {

	public static void checkAttendance(int percentage) throws LowAttendanceException{
		if(percentage < 75) {
			throw new IllegalArgumentException("Not eligible to write exam due to low attendance");
		}
		
		System.out.println("you are eligible");
	}
 
	public static void main(String[] args) {
		
		try {
			checkAttendance(74);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("program completed");
	}
}
