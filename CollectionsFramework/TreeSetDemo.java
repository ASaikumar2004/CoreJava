package CollectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

//		TreeSet<Integer> set=new TreeSet<>();
//		set.add(10);
//		set.add(40);
//		set.add(20);
//		set.add(30);
//		//set.add(null);
//		set.add(30);
//		System.out.println(set);
//		
//		System.out.println(set.higher(20));
//		System.out.println(set.lower(20));
//
//		
		
		
//		
//		TreeSet<Student> tset = new TreeSet<>();
//
//		tset.add(new Student(101, "sai", 23));
//		tset.add(new Student(101, "sai", 23));
//		tset.add(new Student(102, "sivani", 21));
//		tset.add(new Student(101, "sai", 22));
//		System.out.println(tset);
//		
//		
		System.out.println("=========sorted using comparator==============");
		
		TreeSet<Student> tsset = new TreeSet<>(new IdComparator());
		tsset.add(new Student(101, "sai", 23));
		tsset.add(new Student(101, "sai", 23));
		tsset.add(new Student(102, "sivani", 21));
		tsset.add(new Student(101, "sai", 22));
        System.out.println(tsset);
        
        
        
//		
//		System.out.println("first element"+tsset.first());
//		System.out.println("last element"+tsset.last());

	}

}
