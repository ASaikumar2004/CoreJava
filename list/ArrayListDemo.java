package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		

		al.add("sai");
		al.add("Sivani");
		al.add("love");
		
		al.remove(0);
		
		System.out.println(al);
		
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			if(it.next().length()==4) {
				it.remove();
			}
		}
		
		System.out.println(al);

	}
}
