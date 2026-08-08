package Threads;

class Restaurant {
	public void takeorder(String customer) {
		System.out.println(customer+ " is Taking the order...");
		
		try {
			t.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
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
		
		rest.take
	}


	public static void main(String[] args) {
         Customer c=new Customer("Restaurent","Sai");
         Thread t=new Thread(c);
         t.start();
         
	}
}


