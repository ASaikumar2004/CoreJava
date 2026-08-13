package Threads;

class Restaurant1 {
	public void takeorder(String customer) {
		System.out.println(customer+ " is Taking the order...");
		
		System.out.println("chucchcew");
		
		System.out.println(customer+"is taken order.");
		
	}

}

class Customer implements Runnable {
	 String rest;
	 String name;
	Customer(String rest,String name) {
		this.rest=rest;
		this.name=name;
	}

	@Override
	public void run() {
		System.out.println();
	}


	public static void main(String[] args) {
         Customer c=new Customer("Restaurent","Sai");
         Thread t=new Thread(c);
         t.start();
         
	}
}


