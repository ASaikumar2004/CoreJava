package OOPSConcepts;

public class ConstructorDemo {

	int id;
	String name;
	
	public ConstructorDemo() {
		id=10;
		name="Sai";
	}
	
	public void display() {
		System.out.print(id+" ");
		System.out.println(name);
	}
	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd1=new ConstructorDemo();
		cd.display();
		cd1.display();
		
	}
}
