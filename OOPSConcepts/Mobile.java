package OOPSConcepts;

public class Mobile {
	int mobileid;
	String brand;
	String model;
	double price;
	
	//Default Constructor
	public Mobile() {
		mobileid=1001;
		brand="Samsung";
		model="Galaxy A35";
		price=28000.0;
	}
	
    //Parameterized Constructor
	public Mobile(int id,String brnd, String modl,Double pr) {
		mobileid=id;
		brand=brnd;
		model=modl;
		price=pr;
	}
	
	//Copy Constructor
	public Mobile(Mobile m1) {
		mobileid=m1.mobileid;
		brand=m1.brand;
		model=m1.model;
		price=m1.price;
	}

	public void display() {
		System.out.println("Mobile ID : "+mobileid);
		System.out.println("Brand     : "+brand);
		System.out.println("Model     : "+model);
		System.out.println("Price     : "+price);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.display();
		
		Mobile m1=new Mobile(1002,"Oneplus","Nord CE 5",24999.0);
		m1.display();
		
		Mobile m2=new Mobile(m1);
		m2.display();
	}
}
