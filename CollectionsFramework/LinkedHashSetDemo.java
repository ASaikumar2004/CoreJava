package CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(20);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
		for(Integer num:lhs) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		Iterator<Integer> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
//		List<Integer> li=new ArrayList<>(lhs);
//		//Collections.sort(li);
//		System.out.println(li);
		
	}

}
