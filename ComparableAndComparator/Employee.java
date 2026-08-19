package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee {
	
	public static void main(String[] args) {
		
		List<Emp> li=new ArrayList<>();
		
		li.add(new Emp(101, "sai", "cse", 45000, 23));
		li.add(new Emp(103, "sivani", "ece", 55000, 22));
		li.add(new Emp(102, "seeta", "it", 30000, 26));
		li.add(new Emp(104, "rama", "AIML", 22000, 32));
		
		Collections.sort(li,new SalaryComparator());
		
		Iterator<Emp> itr=li.iterator();
		
		while(itr.hasNext()) {
			Emp e=itr.next();
			
			if(e.department.equalsIgnoreCase("IT")) {
				System.out.println(e);
			}
			
//			if(e.salary<30000) {
//				itr.remove();
//			}
		}
		
		
//		for(Emp e:li) {
//			System.out.println(e);
//		}
//		
	}

}
