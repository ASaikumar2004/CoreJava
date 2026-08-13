package MultiThreading;

public class Account {
	int balance=1000;
	synchronized public void withdraw(int amount) throws InterruptedException {
		if(amount>balance) {
			System.out.println("Insuffient funds ! "+Thread.currentThread().getName());
			System.out.println("Waiting for deposit.....");
			wait();
		}
		System.out.println("With draw successful");
		balance=balance-amount;
		System.out.println("remaining balance is: "+balance);
	}
	
	
	synchronized public void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Deposit successful");
		notify();
	}
	

}
