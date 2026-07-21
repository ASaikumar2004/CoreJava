package Encapsulation;

public class Customer {

	private int cusid;
	private String cusname;
	private double balance;
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int cusid() {
		return cusid;
	}
	
	public String cusname() {
		return cusname;
	}
	
	public void setcusid(int cusid) {
		this.cusid=cusid;
	}
	
	public void setcusname(String cusname) {
		this.cusname=cusname;
	}
}
