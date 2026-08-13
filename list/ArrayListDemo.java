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
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("usinmg enhanced for loop");
		System.out.println("=================");
		for(String s:al) {
			System.out.println(s);
		}
		
		
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
