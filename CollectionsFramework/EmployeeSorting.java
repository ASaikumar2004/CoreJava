package CollectionsFramework;

import java.util.ArrayList;
import java.util.Comparator;

class Employee1{
	String name;
	double salary;
	
	public Employee1(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return name+" : "+salary;
	}
}

public class EmployeeSorting {
	
	public static void main(String[] args) {
		
		ArrayList<Employee1>al=new ArrayList<>();
		
		al.add(new Employee1("Ravi", 50000));
		al.add(new Employee1("Anil", 70000));
		al.add(new Employee1("Sita", 50000));
		al.add(new Employee1("Kiran", 70000));
		
		Comparator<Employee1> c=(e1,e2)->{
			if(e1.salary!=e2.salary) {
				return Double.compare(e2.salary, e1.salary);
			}
			return e1.name.compareTo(e2.name);
		};
		
		al.sort(c);
		
		for(Employee1 e:al) {
			System.out.println(e);
		}
		
	}

}
