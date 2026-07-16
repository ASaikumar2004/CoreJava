package OOPSConcepts;

public class Calculator {

	int a;
	int b;
	public Calculator(int a,int b) {
		this.a=a;
		this.b=b;
		
		
	}
	
	void display() {
		int sum=a+b;
		System.out.println("Sum is: "+sum);
		int sub=a-b;
		System.out.println("Sub is: "+sub);
		System.out.println();
	}
	public static void main(String[] args) {
		Calculator c=new Calculator(10,20);
		c.display();
	}
}
