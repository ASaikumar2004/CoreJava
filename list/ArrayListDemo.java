package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		

		al.add("sai");
		al.add("Sivani");
		al.add("love");
		System.out.println(al);
		
		/*
		 * ListIterator<String> it=al.listIterator(al.size()); while(it.hasPrevious()) {
		 * System.out.println(it.previous()); }
		 */
		
		/*
		 * while(it.hasNext()) { if(it.next().toUpperCase().contains("A")){ it.remove();
		 * } }
		 */
		
//		Collections.sort(al);
//		Collections.reverse(al);
		System.out.println(al);

	}
}
