package CollectionsFramework;

import java.util.LinkedHashSet;

public class Duplicates {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("ravi");
		lhs.add("anil");
		lhs.add("ravi");
		lhs.add("sita");
		lhs.add("anil");
		lhs.add("kiran");
		
		System.out.println(lhs);
		
	}

}
