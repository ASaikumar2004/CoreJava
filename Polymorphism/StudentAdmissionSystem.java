package Polymorphism;

public class StudentAdmissionSystem {
	String name;
	String course;
	double fee;

	public StudentAdmissionSystem(String name) {
		this.name=name;
		this.course="Not assigned";
		this.fee=0.0;
	}
	
	public StudentAdmissionSystem(String name, String course) {
		this.name=name;
		this.course=course;
		this.fee=0.0;
	}
	
	public StudentAdmissionSystem(String name, String course,double fee) {
		this.name=name;
		this.course=course;
		this.fee=fee;
	}
	
	public void display() {
		System.out.println("name: "+name);
		System.out.println("course: "+course);
		System.out.println("fee: "+fee);
		System.out.println("============================");
	}
	public static void main(String[] args) {
		StudentAdmissionSystem s=new StudentAdmissionSystem("sai");
		StudentAdmissionSystem s1=new StudentAdmissionSystem("Sai","Java FullStack");
		StudentAdmissionSystem s3=new StudentAdmissionSystem("Sai", "Full stack java", 47000);
		s.display();
		s1.display();
		s3.display();
	}
}
