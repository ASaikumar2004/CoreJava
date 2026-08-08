package Threads;

public class Restaurant implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Order successful given t0 the customer");
	}
	
	public static void main(String[] args) {
		
		Restaurant r=new Restaurant();
		Thread t=new Thread(r);
		
		t.start();
		System.out.println("Customer ordering Successfull");
		
		
		
	}

}
