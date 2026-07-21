package Encapsulation;

public class Bank {

	
//	
//	public void checkbalance() {
//		System.out.println("balance is: "+balance);
//	}
//	
//	public void withdraw(int amount) {
//		if(amount<balance) {
//			
//			withdraw=balance-amount;
//		}
//		else {
//			System.out.println("Insufficient funds");
//		}
//		System.out.println("Withdraw successful: "+withdraw);
//	}
//	
	public static void main(String[] args) {
		Customer c=new Customer();
		c.cusid();
		c.cusname();
		c.setBalance(20000);
		Bank b=new Bank();
		
		
	}
}
