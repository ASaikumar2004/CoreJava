package Strings;

public class ReverseString {
	
	public void reverse(String str) {
		String rev="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		
		
	}
	public static void main(String[] args) {
		
		ReverseString r=new ReverseString();
		r.reverse("javadev");
	}

}
