package FunctionalRecursion;

public class Palindrome {
	static public boolean palindrome(String str,int start, int end) {
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		return palindrome(str,start+1,end-1);
	}
	public static void main(String[] args) {

		String s="race";
		System.out.println(palindrome(s,0,s.length()-1));
	}
}
