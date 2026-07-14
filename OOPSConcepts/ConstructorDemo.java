package OOPSConcepts;

public class ConstructorDemo {

	int id;
	String name;
	
	public ConstructorDemo(int sid, String sname) {
		id=sid;
		name=sname;
	}
	
	public ConstructorDemo(ConstructorDemo cd) {
		id=cd.id;
		name=cd.name;
	}

	public void display() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
	}
	public static void main(String[] args) {
		System.out.println("object is used: ");
		ConstructorDemo cd=new ConstructorDemo(101,"sai");
		ConstructorDemo cd3=new ConstructorDemo(cd);
		ConstructorDemo cd1=new ConstructorDemo(102,"Sivani");
		ConstructorDemo cd4=new ConstructorDemo(cd1);
		cd.display();
		cd1.display();
		cd3.display();
		cd4.display();
		
	}
}
