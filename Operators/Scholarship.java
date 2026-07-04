package Operators;

public class Scholarship {
	public static void main(String[] args) {
		int marks=48;
		boolean sports=false;
		String res=(marks>=90 || sports==true)?"Eligible":"not eligible";
		System.out.println(res);
	}

}
