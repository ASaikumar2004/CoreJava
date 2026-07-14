package OOPSConcepts;

public class Student {

	static {
		System.out.println("Student management system started");
	}
	{
		System.out.println("Student object Created");
	}
	
	int id;
	String name;
	String course;
	
	public static void main(String[] args) {
		Student s=new Student();
		s.id=10;
		s.name="sai";
		s.course="java";
		
		System.out.println(s.id+" "+s.name+" "+s.course);
		
	}
}
