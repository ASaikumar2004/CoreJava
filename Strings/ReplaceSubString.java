package Strings;

public class ReplaceSubString {
	public static void main(String[] args) {
		String name="Java Development";
		String result=name.replaceAll("Java", "Core java");
		System.out.println(result);
		
		String r=name.strip();
		System.out.println(r);
		
		String r1[]=name.split(" ");
		for(String n:r1) {
		System.out.print(n);
		}
	}

}
