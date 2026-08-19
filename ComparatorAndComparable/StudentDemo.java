package CoreJava.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(90);
		al.add(30);
		//System.out.println(al);
		//Collections.sort(al);
		//System.out.println(al);
		
		List<Student>slist=new ArrayList<>();
		
		Student s1=new Student(101,"ram",45);
		slist.add(s1);
		slist.add(new Student(117,"teja",23));
		slist.add(new Student(113,"keerthi",24));
		
		/*
		 * System.out.println("before sorting"); System.out.println(slist);
		 * 
		 * System.out.println("after sorting based on id"); Collections.sort(slist);
		 * System.out.println(slist);
		 * 
		 * System.out.println("after sorting based age"); Collections.sort(slist,new
		 * AgeComparator()); System.out.println(slist);
		 * 
		 * System.out.println("after sorting name "); Collections.sort(slist);
		 * System.out.println(slist);
		 */
		/*
		 * for(Student s:slist) { System.out.println(s); }
		 */
		
		int cid=1130;
		    boolean found=true;
		    
		for(Student s:slist) {
			if(s.id==cid) {
				System.out.println(s);
                found=false;
				break;
			}
		}
		
		if(found) {
			System.out.println("id not found");
		}
		
		
		

	}

}
