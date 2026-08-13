package MultiThreading;

public class Main {
	
	public static void main(String[] args) throws InterruptedException{
		Account ac=new Account();
		Customer c1=new Customer(ac);
		
		Thread t1=new Thread(c1,"sai");
		t1.start();
		t1.sleep(2000);
		
		System.out.println("Deposit done with main thread...");
		ac.deposit(1000);
	}

}
