package CollectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
public class HashMapStudent {
	
	public static void main(String[] args) {
		
		HashMap<String,ArrayList<Employee>> map=new HashMap<>();
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(101,"Sai"));
		al.add(new Employee(102, "sivani"));
		
		ArrayList<Employee> al1=new ArrayList<>();
		al1.add(new Employee(201,"ramu"));
		al1.add(new Employee(102, "seeta"));
		
		map.put("Java",al);
		map.put("python", al1);
		
		for(String key:map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
		
		
	}
	
	
	
	

}
