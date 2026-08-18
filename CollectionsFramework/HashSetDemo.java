package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		
		System.out.println(set1.contains(10));
		System.out.println(set1.containsAll(set));
		
		set.removeAll(set1);
		System.out.println(set);
		
//		LinkedHashSet<Integer> li=new LinkedHashSet<>();
//		li.add(20);
//		li.add(10);
//		li.add(30);
//		System.out.println(li);
		
//		List<Integer> li=new ArrayList<>(set);
//		Collections.sort(li);
//		System.out.println(li);
		
		HashSet<Student> sset=new HashSet<>();
		sset.add(new Student(101, "sai", 23));
		sset.add(new Student(101, "sai", 23));
		sset.add(new Student(102, "Sivani", 22));
		
		System.out.println(sset);
		
		
	}

}
