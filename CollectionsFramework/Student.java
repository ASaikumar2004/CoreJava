package CollectionsFramework;


public class Student implements Comparable<Student> {
	
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "id=" + id + ","
				+ " name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	public int compareTo(Student s) {
		if(this.id!=s.id) {
			return Integer.compare(this.id, s.id);
		}
		
		if(!this.name.equals(s.name)) {
		   return this.name.compareTo(s.name);
		}
		
		return Integer.compare(this.age, s.age);
	}
	
	

}
