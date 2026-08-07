package Exceptions;

class PasswordLengthException extends Exception {
	PasswordLengthException(String message) {
		super(message);
	}
}

public class PasswordLengthValidation{

	static void checkpassword(String password) throws PasswordLengthException {
		if (password.length() < 8) {
			throw new IllegalArgumentException("Password must contain 8 characters ");
		}
		System.out.println("password created successfull.....");
	}

	public static void main(String[] args) {
		try {
			checkpassword("sai@12");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("program ended");

	}

}

