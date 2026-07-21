package Encapsulation;

public class Bank {

	int cusid=101;
	String cusname="saikumar";
	static double balance=20000;
	static double withdraw;
	
	public void checkbalance() {
		System.out.println("balance is: "+balance);
	}
	
	public void withdraw(int amount) {
		if(amount<balance) {
			
			withdraw=balance-amount;
		}
		else {
			System.out.println("Insufficient funds");
		}
		System.out.println("Withdraw successful: "+withdraw);
	}
	
	public static void main(String[] args) {
		Customer c=new Customer();
		Bank b=new Bank();
		b.checkbalance();
		b.withdraw(2000);
		
		
	}
}
