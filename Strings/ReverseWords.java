package Strings;

public class ReverseWords {

	public static void main(String[] args) {

		String input = "I love Java";
		String s[] = input.split(" ");
		String rev = "";
		
		for(int i=s.length-1;i>=0;i--) {
			rev=rev+s[i]+" ";
		}

		System.out.println(rev);
	}

}
