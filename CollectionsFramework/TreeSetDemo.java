package CollectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> set=new TreeSet<>();
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);
		//set.add(null);
		
		set.add(30);
		
		System.out.println(set);
		
		Set<Student> tset=new TreeSet<>();
		
		tset.add(new Student(101,"sai",23));
		tset.add(new Student(102,"sivani",21));
		tset.add(new Student(101,"sai",22));
		
		System.out.println(tset);
		
	}

}
