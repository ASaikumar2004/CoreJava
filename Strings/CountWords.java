package Strings;

public class CountWords {
	
	void countword(String str) {
		String []s=str.split(" ");
//		int count=1;
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==' ') {
//				count++;
//			}
//		}
		System.out.println(s.length);
	}

	public static void main(String[] args) {
		CountWords c=new CountWords();
		c.countword("I am a java developer");
	}
}
