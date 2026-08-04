package Strings;

public class Palindrome {

	public void reverse(String str) {
		System.out.println(str);
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		System.out.println(rev);
		
        //palindromecode
		if (str.equals(rev)) {
			System.out.println("Palindome");
		}
		else {
			System.out.println("Not A Palindrome");
		}

	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.reverse("madam");
	}
}
