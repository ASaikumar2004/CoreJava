package OOPSConcepts;

public class Employee {
	int empid;
	String empname;
	String department;
	int salary;

	public Employee(int id, String name, String dep, int sal) {
		empid = id;
		empname = name;
		department = dep;
		salary = sal;
	}
	
	public void display() {
		System.out.println("Employee ID: "+empid);
		System.out.println("Name:      : "+empname);
		System.out.println("Department : "+department);
		System.out.println("Salary     : "+salary);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee(101, "Ravi", "HR", 35000);
		emp.display();
		Employee emp1=new Employee(102,"Priya","Developer",55000);
		emp1.display();
		Employee emp2=new Employee(103,"Kiran","Testing",42000);
		emp1.display();
		
		
	}
}
