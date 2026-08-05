package Strings;

public class CountingSubStringFrequency {
	public static void main(String[] args) {
		
	String str1 = "we work to live and live to be happy live";  
	String word="live";
	
	String s[]=str1.split(" ");
	int count=0;
	for(int i=0;i<s.length;i++) {
		if(s[i].equals(word)) {
			count++;
		}
	}
	System.out.println("count of live is: "+count);
	            

}
}
