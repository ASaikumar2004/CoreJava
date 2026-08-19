package ComparableAndComparator;

public class Emp {
	
	int id;
	String name;
	String department;
	double salary;
	int age;
	
	public Emp(int id,String name,String department,double salary, int age) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
		this.age=age;
	}
	
	public String toString() {
		return id+" "+name+" "+department+" "+salary+" "+age;
	}

}
