package MultiThreading;

public class Customer implements Runnable{
	Account ac;
	public Customer(Account ac) {
		this.ac=ac;
	}
	
	@Override
	public void run() {
		try {
			ac.withdraw(1100);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
