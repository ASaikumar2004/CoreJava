package FunctionalRecursion;

public class ReverseString {
	
	static public String reverse(String str) {
		if(str.length()==0) {
			return "";
		}
		
		return reverse(str.substring(1))+str.charAt(0);
	}

	public static void main(String[] args) {

		String res=reverse("hello");
		System.out.println(res);
	}
}
