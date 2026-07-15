package OOPSConcepts;

public class Student1 {

	// 1. Refer to the Current Class Instance Variable
	// Used when a local variable (parameter) and an instance variable have the same
	// name.
//	int age=30;
//	String name;
//	public Student1(int age, String name) {
//		this.age=age;
//		this.name=name;
//	}
//	public static void main(String[] args) {
//		Student1 std=new Student1(21,"sai");
//		System.out.println(std.age+" "+std.name);
//	}

//	2. Invoke (Call) the Current Class Method
//Use this to call another method of the same class.
	
	void display() {
		System.out.println("Display method ");
	}
	
	void show() {
		this.display();
	}
	
	public static void main(String[] args) {
		Student1 std=new Student1();
		std.show();
	}
	
}
