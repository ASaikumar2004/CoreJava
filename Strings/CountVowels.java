package Strings;

public class CountVowels {

	public static void main(String[] args) {
		String input = "javajava";
		String upper=input.toUpperCase();
		int count = 0;
		char ch[] = upper.toCharArray();
		
		for(char ch1:ch) {
			if(ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U') {
				count++;
			}
		}
		System.out.println(count);
	}
}
