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
		System.out.println(al);
		
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			if(it.next().contains("a")){
				it.remove();
			}
		}
		
		System.out.println(al);

	}
}
