package Strings;

public class CountCharacters {
	public static void main(String[] args) {
		String input = "javaj";
		int count = 0;
		char ch[] = input.toCharArray();
		for(char ch1:ch) {
			if(ch1=='j') {
				count++;
			}
		}
		System.out.println("count of J is: "+count);

	}

}
