package Strings;

public class LongestWord {
	public static void main(String[] args) {
		String s = "I am a java developer";
		 String[] words = s.split(" ");
		 
		 String big="";
		 
		 for(String word:words) {
			 if(word.length()> big.length()) {
				 big=word;
			 }
		 }
		 
		 System.out.println(big);
		
	}

}
